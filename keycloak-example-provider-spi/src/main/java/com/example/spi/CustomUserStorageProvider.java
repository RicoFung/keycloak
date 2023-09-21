package com.example.spi;

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

import java.util.List;
import java.util.Map;
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
        log.debug("[isValid( realmModel,  userModel,  credentialInput)] => sid: {}", sid);
        String eid = sid.getExternalId();
        log.debug("[isValid( realmModel,  userModel,  credentialInput)] => eid: {}", eid);
        User user = http.getOneById(eid);
        String pwd = user.getPassword();
        log.debug("[isValid( realmModel,  userModel,  credentialInput)] => pwd: {}", pwd);
        return pwd.equals(credentialInput.getChallengeResponse());
    }

    @Override
    public UserModel getUserById(RealmModel realm, String id) {
        log.debug("[getUserById( id,  realmModel)] => id: {}", id);
        StorageId sid = new StorageId(id);
        log.debug("[getUserById( id,  realmModel)] => sid: {}", sid);
        String eid = sid.getExternalId();
        log.debug("[getUserById( id,  realmModel)] => eid: {}", eid);
        User user = http.getOneById(eid);
        return new UserAdapter(session, realm, model, user);
    }

    @Override
    public UserModel getUserByUsername(RealmModel realm, String username) {
        log.debug("[getUserByUsername( username,  realmModel)] => username: {}", username);
        User user = null;
        try {
            user = http.getOneByCodeOrName(username);
        } catch (Exception e) {
            log.warn("username: {} not exists ! ", username);
            return null;
        }
        return new UserAdapter(session, realm, model, user);
    }

    @Override
    public UserModel getUserByEmail(RealmModel realm, String id) {
        return null;
    }

    @Override
    public Stream<UserModel> searchForUserStream(RealmModel realm, Map<String, String> map, Integer firstResult, Integer maxResults) {
        log.debug("[searchForUserStream(realmModel, map: {}, firstResult: {}, maxResults: {})]", map, firstResult, maxResults);
        firstResult = firstResult==null?1:++firstResult;
        maxResults = maxResults==null?3000:maxResults;
        List<User> users = http.getList(map.get("keycloak.session.realm.users.query.search"), firstResult, maxResults);
        Stream<UserModel> userModelList = convertUserModels(realm, users);
        return userModelList;
    }

    @Override
    public int getUsersCount(RealmModel realm) {
        log.debug("[getUsersCount( realmModel: {})]", realm);
        return http.getCount();
    }

    @Override
    public Stream<UserModel> getGroupMembersStream(RealmModel realmModel, GroupModel groupModel, Integer integer, Integer integer1) {
        return null;
    }

    @Override
    public Stream<UserModel> searchForUserByUserAttributeStream(RealmModel realmModel, String s, String s1) {
        return null;
    }

    @Override
    public void close() {

    }

    private Stream<UserModel> convertUserModels(RealmModel realm, List<User> users) {
        Stream<UserModel> userModelList = users.stream().map(user ->
            new UserAdapter(session, realm, model, user)
        );
        return userModelList;
    }

}
