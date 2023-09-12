package com.example.spi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String usercode;
    private String username;
    private String password;
    private String email;

    @JsonCreator
    public User(@JsonProperty("id") long id, @JsonProperty("usercode") String usercode,
                @JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("email") String email) {
        this.id = id;
        this.usercode = usercode;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
