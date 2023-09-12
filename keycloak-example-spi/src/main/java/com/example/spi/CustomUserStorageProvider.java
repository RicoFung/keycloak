package com.example.spi;

import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.GroupModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.models.credential.PasswordCredentialModel;
import org.keycloak.storage.StorageId;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;
import org.keycloak.storage.user.UserQueryProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class CustomUserStorageProvider implements UserStorageProvider,
        UserLookupProvider,
        CredentialInputValidator,
        UserQueryProvider {
    protected KeycloakSession session;
    protected ComponentModel model;

    public CustomUserStorageProvider(KeycloakSession session, ComponentModel model) {
        this.session = session;
        this.model = model;
    }

    @Override
    public boolean supportsCredentialType(String s) {
        return PasswordCredentialModel.TYPE.endsWith(s);
    }

    @Override
    public boolean isConfiguredFor(RealmModel realmModel, UserModel userModel, String s) {
        return supportsCredentialType(s);
    }

    @Override
    public boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput) {
        if (!this.supportsCredentialType(credentialInput.getType())) {
            return false;
        }

        StorageId sid = new StorageId(userModel.getId());
        String id = sid.getExternalId();

        try (Connection c = DbUtil.getConnection(this.model)) {
            PreparedStatement st = c.prepareStatement("select tc_password from tb_user_info_0a where tc_code = ?");
//            PreparedStatement st = c.prepareStatement("select password from user where id = ?");
            st.setString(1, id);
            st.execute();
            ResultSet rs = st.getResultSet();

            if (rs.next()) {
                String pwd = rs.getString(1);
                return pwd.equals(credentialInput.getChallengeResponse());
            } else {
                return false;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);

        }
    }

    @Override
    public void close() {

    }

    @Override
    public UserModel getUserById(String id, RealmModel realmModel) {
        System.out.println("[UserModel getUserById(String id, RealmModel realmModel)] => id:" + id);
        try (Connection c = DbUtil.getConnection(this.model)) {
            StorageId sid = new StorageId(id);
            System.out.println("[UserModel getUserById(String id, RealmModel realmModel)] => sid:" + sid);
            String externalId = sid.getExternalId();
            System.out.println("[UserModel getUserById(String id, RealmModel realmModel)] => externalId:" + externalId);
            PreparedStatement st = c.prepareStatement("select tc_rowid, tc_code, tc_password, '' as tc_email from tb_user_info_0a where tc_code = ?");
//            PreparedStatement st = c.prepareStatement("select id, username, password, email from user where id = ?");
            st.setString(1, externalId);
            st.execute();
            ResultSet rs = st.getResultSet();
            if (rs.next()) {
                return mapUser(realmModel, rs);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);
        }
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realmModel) {
        System.out.println("[UserModel getUserByUsername(String username, RealmModel realmModel)]");
        try (Connection c = DbUtil.getConnection(this.model)) {
            PreparedStatement st = c.prepareStatement("select tc_rowid, tc_code, tc_password, '' as tc_email from tb_user_info_0a where tc_name = ?");
//            PreparedStatement st = c.prepareStatement("select id, username, password, email from user where username = ?");
            st.setString(1, username);
            st.execute();
            ResultSet rs = st.getResultSet();
            if (rs.next()) {
                return mapUser(realmModel, rs);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);
        }
    }

    @Override
    public UserModel getUserByEmail(String s, RealmModel realmModel) {
        return null;
    }

    @Override
    public List<UserModel> getUsers(RealmModel realmModel) {
        System.out.println("[List<UserModel> getUsers(RealmModel realmModel)]");
        try (Connection c = DbUtil.getConnection(this.model)) {
            PreparedStatement st = c.prepareStatement("select tc_rowid, tc_code, tc_password, '' as tc_email from tb_user_info_0a where tc_status = '1'");
//            PreparedStatement st = c.prepareStatement("select id, username, password, email from user");
            st.execute();
            ResultSet rs = st.getResultSet();
            List<UserModel> users = new ArrayList<>();
            while (rs.next()) {
                users.add(mapUser(realmModel, rs));
            }
            return users;
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);
        }
    }

    @Override
    public List<UserModel> getUsers(RealmModel realmModel, int firstResult, int maxResults) {
//        System.out.println("[List<UserModel> getUsers(RealmModel realmModel, int firstResult, int maxResults)]");
        System.out.println("[List<UserModel> getUsers(RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
        try (Connection c = DbUtil.getConnection(this.model)) {
            PreparedStatement st = c.prepareStatement("select *" +
                    "  from (select row_.*, rownum rownum_" +
                    "          from (select tt.*" +
                    "                  from (select t.tc_rowid," +
                    "                               t.tc_code," +
                    "                               t.tc_password," +
                    "                               '' as tc_email" +
                    "                          from tb_user_info_0a t" +
                    "                         where t.tc_status = 1" +
                    "                         ) tt) row_" +
                    "         where rownum <= (?+1) * ?)" +
                    " where rownum_ > (?+1 - 1) * ?");
            st.setInt(1, firstResult);
            st.setInt(2, maxResults);
            st.setInt(3, firstResult);
            st.setInt(4, maxResults);
//            PreparedStatement st = c.prepareStatement("select id, username, password, email from user order by id limit ? offset ?");
//            st.setInt(1, maxResults);
//            st.setInt(2, firstResult);
            st.execute();
            ResultSet rs = st.getResultSet();
            List<UserModel> users = new ArrayList<>();
            while (rs.next()) {
                users.add(mapUser(realmModel, rs));
            }
            return users;
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);
        }
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realmModel) {
        System.out.println("[List<UserModel> searchForUser(String search, RealmModel realmModel)]");
        return searchForUser(search, realmModel, 0, 5000);
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realmModel, int firstResult, int maxResults) {
        System.out.println("[List<UserModel> searchForUser(String search:"+search+", RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
        try (Connection c = DbUtil.getConnection(this.model)) {
            PreparedStatement st = c.prepareStatement("select *" +
                    "  from (select row_.*, rownum rownum_" +
                    "          from (select tt.*" +
                    "                  from (select t.tc_rowid," +
                    "                               t.tc_code," +
                    "                               t.tc_password," +
                    "                               '' as tc_email" +
                    "                          from tb_user_info_0a t" +
                    "                         where t.tc_name like ? and t.tc_status = 1" +
                    "                         ) tt) row_" +
                    "         where rownum <= (?+1) * ?)" +
                    " where rownum_ > (?+1 - 1) * ?");
            st.setString(1, search);
            st.setInt(2, firstResult);
            st.setInt(3, maxResults);
            st.setInt(4, firstResult);
            st.setInt(5, maxResults);

//            PreparedStatement st = c.prepareStatement("select id, username, password, email from user where username like ? order by id limit ? offset ?");
//            st.setString(1, search);
//            st.setInt(2, maxResults);
//            st.setInt(3, firstResult);
            st.execute();
            ResultSet rs = st.getResultSet();
            List<UserModel> users = new ArrayList<>();
            while (rs.next()) {
                users.add(mapUser(realmModel, rs));
            }
            return users;
        } catch (SQLException ex) {
            throw new RuntimeException("Database error:" + ex.getMessage(), ex);
        }
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realmModel) {
        System.out.println("[List<UserModel> searchForUser(Map<String, String> params, RealmModel realmModel)]");
        return searchForUser(params, realmModel, 0, 5000);
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult, int maxResults) {
        System.out.println("[List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
//        System.out.println("[List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult, int maxResults)]");
        return getUsers(realmModel, firstResult, maxResults);
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realmModel, GroupModel groupModel) {
        return Collections.emptyList();
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realmModel, GroupModel groupModel, int i, int i1) {
        return Collections.emptyList();
    }

    @Override
    public List<UserModel> searchForUserByUserAttribute(String s, String s1, RealmModel realmModel) {
        return Collections.emptyList();
    }

    private UserModel mapUser(RealmModel realm, ResultSet rs) throws SQLException {
        User user = new User(Long.parseLong(rs.getString("tc_rowid")), rs.getString("tc_code"), rs.getString("tc_password"), rs.getString("tc_email"));
//        User user = new User(Long.parseLong(rs.getString("id")), rs.getString("username"), rs.getString("password"), rs.getString("email"));
        System.out.println("[user]: " + user.toString());

        UserAdapter userAdapter = new UserAdapter(session, realm, model, user);
        System.out.println("[userAdapter]: " + userAdapter.toString());
        return userAdapter;
    }

}
