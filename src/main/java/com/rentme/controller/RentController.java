package com.rentme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rent")
public class RentController {
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void createProduct(@RequestParam(value = "loginid") Long loginId, @RequestParam(value = "pid") Long pId) {
    
	}

}
