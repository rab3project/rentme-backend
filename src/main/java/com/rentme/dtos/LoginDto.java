package com.rentme.dtos;

import java.util.Date;

public class LoginDto {
	private Long id;
	private String username;
	private String password;
	private Date lastSignOn;
	private Date ceatedAt;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastSignOn() {
		return lastSignOn;
	}
	public void setLastSignOn(Date lastSignOn) {
		this.lastSignOn = lastSignOn;
	}
	public Date getCeatedAt() {
		return ceatedAt;
	}
	public void setCeatedAt(Date ceatedAt) {
		this.ceatedAt = ceatedAt;
	}

	
}
