package com.example.spi;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.storage.StorageId;
import org.keycloak.storage.adapter.AbstractUserAdapterFederatedStorage;

public class UserAdapter extends AbstractUserAdapterFederatedStorage {
    private final User user;
    private String keycloakId;

    public UserAdapter(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel, User user) {
        super(session, realm, storageProviderModel);
        this.user = user;

        if (user != null) {
            this.keycloakId = StorageId.keycloakId(storageProviderModel, user.getId().toString());
        }
        setEnabled(true);
    }

    @Override
    public String getId() {
        return keycloakId;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public void setUsername(String s) {
        user.setUsername(s);
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public void setEmail(String email) {
        user.setEmail(email);
    }

    @Override
    public String toString() {
        return "UserAdapter{" +
                "user=" + user +
                ", keycloakId='" + keycloakId + '\'' +
                '}';
    }
}
