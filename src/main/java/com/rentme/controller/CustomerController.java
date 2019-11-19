package com.rentme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentme.dtos.CustomerSignupDto;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void signup(@RequestBody CustomerSignupDto signupDto) {
		
	}
}
