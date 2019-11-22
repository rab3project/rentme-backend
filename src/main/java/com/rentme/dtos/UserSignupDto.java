package com.rentme.dtos;

public class UserSignupDto {

	private String name;
	private String email;
	private String phone;
	private String username;
	private String password;
	private String address;
	private CustomerAddressDto customerAddressDto;
	private UserLoginDto loginDto;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public CustomerAddressDto getCustomerAddressDto() {
		return customerAddressDto;
	}

	public void setCustomerAddressDto(CustomerAddressDto customerAddressDto) {
		this.customerAddressDto = customerAddressDto;
	}

	public UserLoginDto getLoginDto() {
		return loginDto;
	}

	public void setLoginDto(UserLoginDto loginDto) {
		this.loginDto = loginDto;
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

	
}
