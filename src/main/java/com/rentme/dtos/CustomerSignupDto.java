package com.rentme.dtos;

public class CustomerSignupDto {

	private String name;
	private String email;
	private String phone;
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
