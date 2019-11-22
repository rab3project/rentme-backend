package com.rentme.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.rentme.services.UserLoginService;

@RestController
@RequestMapping(value ="/login")
public class UserLoginController {
	
	
	@Autowired
	UserLoginService uLService;
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public boolean createSomething(@RequestParam (value = "username") String username,
			@RequestParam (value = "password") String password) {
		uLService.getForLogin(username, password);
		
		return true;
	}
}
