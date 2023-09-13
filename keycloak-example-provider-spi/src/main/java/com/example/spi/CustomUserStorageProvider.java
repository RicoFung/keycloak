package com.example.spi;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.*;
import org.keycloak.models.credential.PasswordCredentialModel;
import org.keycloak.storage.StorageId;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;
import org.keycloak.storage.user.UserQueryProvider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class CustomUserStorageProvider implements UserStorageProvider,
        UserLookupProvider,
        CredentialInputValidator,
        UserQueryProvider {
    private final KeycloakSession session;
    private final ComponentModel model;
    private final UsersHttp http;

    public CustomUserStorageProvider(KeycloakSession session, ComponentModel model) {
        this.session = session;
        this.model = model;
        this.http = new UsersHttp(session, model);
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
        if (!supportsCredentialType(credentialInput.getType()) || !(credentialInput instanceof UserCredentialModel)) {
            return false;
        }
        StorageId sid = new StorageId(userModel.getId());
        log.debug("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => sid: {}", sid);
        System.out.println("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => sid: " + sid);
        String eid = sid.getExternalId();
        log.debug("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => eid: {}", eid);
        System.out.println("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => eid: " + eid);
        User user = http.getOneById(eid);
        String pwd = user.getPassword();
        log.debug("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => pwd: {}", pwd);
        System.out.println("[boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput)] => pwd: " + pwd);
        return pwd.equals(credentialInput.getChallengeResponse());
    }

    @Override
    public void close() {

    }

    @Override
    public UserModel getUserById(String id, RealmModel realm) {
        log.debug("[UserModel getUserById(String id, RealmModel realmModel)] => id: {}", id);
        StorageId sid = new StorageId(id);
        log.debug("[UserModel getUserById(String id, RealmModel realmModel)] => sid: {}", sid);
        String externalId = sid.getExternalId();
        log.debug("[UserModel getUserById(String id, RealmModel realmModel)] => externalId: {}", sid);
        User user = http.getOneById(externalId);
        return new UserAdapter(session, realm, model, user);
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realm) {
        log.debug("[UserModel getUserByUsername(String username, RealmModel realmModel)] => username: {}", username);
        User user = http.getOneByName(username);
        return new UserAdapter(session, realm, model, user);
    }

    @Override
    public UserModel getUserByEmail(String s, RealmModel realmModel) {
        return null;
    }

    @Override
    @SneakyThrows
    public List<UserModel> getUsers(RealmModel realm) {
        System.out.println("[List<UserModel> getUsers(RealmModel realmModel)]");
        List<User> users = http.getList(null, null, null);
        List<UserModel> userModelList = convertUserModels(realm, users);
        return userModelList;
    }

    @Override
    public List<UserModel> getUsers(RealmModel realm, int firstResult, int maxResults) {
        log.debug("[List<UserModel> getUsers(RealmModel realmModel, int firstResult: {}, int maxResults: {})]", firstResult, maxResults);
        System.out.println("[List<UserModel> getUsers(RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
        List<User> users = http.getList(null, firstResult, maxResults);
        List<UserModel> userModelList = convertUserModels(realm, users);
        return userModelList;
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realmModel) {
        log.debug("[List<UserModel> searchForUser(String search, RealmModel realmModel)]");
        System.out.println("[List<UserModel> searchForUser(String search, RealmModel realmModel)]");
        return searchForUser(search, realmModel, 0, 100);
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realm, int firstResult, int maxResults) {
        System.out.println("[List<UserModel> searchForUser(String search:"+search+", RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
        List<User> users = http.getList(search, firstResult, maxResults);
        List<UserModel> userModelList = convertUserModels(realm, users);
        return userModelList;
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realmModel) {
        log.debug("[List<UserModel> searchForUser(Map<String, String> params, RealmModel realmModel)]");
        System.out.println("[List<UserModel> searchForUser(Map<String, String> params, RealmModel realmModel)]");
        return searchForUser(params, realmModel, 0, 100);
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult, int maxResults) {
        log.debug("[List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult:{}, int maxResults:{})]", firstResult, maxResults);
        System.out.println("[List<UserModel> searchForUser(Map<String, String> map, RealmModel realmModel, int firstResult:"+firstResult+", int maxResults:"+maxResults+")]");
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

    private List<UserModel> convertUserModels(RealmModel realm, List<User> users) {
        List<UserModel> userModelList = users.stream().map(user ->
        {
            return new UserAdapter(session, realm, model, user);
        }).collect(Collectors.toList());
        return userModelList;
    }
}
