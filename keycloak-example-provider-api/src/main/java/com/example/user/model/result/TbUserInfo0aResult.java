package com.example.user.model.result;

import com.example.user.model.entity.TbUserInfo0a;

import java.io.Serializable;

public class TbUserInfo0aResult implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String usercode;
	private String username;
	private String password;
	private String email;

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
