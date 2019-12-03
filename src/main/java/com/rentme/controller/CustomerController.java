package com.rentme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentme.dtos.CustomerSignupDto;
import com.rentme.services.UserSignupService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private UserSignupService USService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public void signup(@RequestBody CustomerSignupDto signupDto) {
		USService.createUser(signupDto);
	}
}
