package com.rentme.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class UserSignupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "active")
	private Long active;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private UserLoginEntity userLogin;

	public UserSignupEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public UserLoginEntity getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLoginEntity userLogin) {
		this.userLogin = userLogin;
	}

	@Override
	public String toString() {
		return "UserSignupEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", createdAt=" + createdAt + ", active=" + active + ", userLogin=" + userLogin
				+ "]";
	}

}
