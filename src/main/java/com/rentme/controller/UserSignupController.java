package com.rentme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rentme.dtos.UserSignupDto;
import com.rentme.services.UserSignupService;

@RestController
@RequestMapping("/user")
public class UserSignupController {

	@Autowired
	private UserSignupService USService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public void signup(@RequestBody UserSignupDto signupDto) {
		USService.createUser(signupDto);
	}
}
