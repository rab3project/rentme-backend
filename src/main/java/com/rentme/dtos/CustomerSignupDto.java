package com.rentme.dtos;

import java.util.Date;

public class CustomerSignupDto {

	private String name;
	private String email;
	private String phone;
	private Date createdAt;
	private String countryCode;
	private Long active;
	private CustomerAddressDto customerAddressDto;
	
	private LoginDto loginDto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public CustomerAddressDto getCustomerAddressDto() {
		return customerAddressDto;
	}

	public void setCustomerAddressDto(CustomerAddressDto customerAddressDto) {
		this.customerAddressDto = customerAddressDto;
	}

	public LoginDto getLoginDto() {
		return loginDto;
	}

	public void setLoginDto(LoginDto loginDto) {
		this.loginDto = loginDto;
	}

}