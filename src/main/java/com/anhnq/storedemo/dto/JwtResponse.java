package com.anhnq.storedemo.dto;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private Long id;
	private String username;
	private String email;

	public JwtResponse(String jwttoken, Long id, String username, String email) {
		this.jwttoken = jwttoken;
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}