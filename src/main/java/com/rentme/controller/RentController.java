package com.rentme.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentme.dtos.ProductDto;
import com.rentme.services.RentService;



@RestController
@RequestMapping("/rent")
public class RentController {
	
	@Autowired 
	private RentService rService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public List<ProductDto> viewProduct() {
		return rService.viewAll();
		
	}

	@RequestMapping(value = "/rent", method = RequestMethod.POST)
	public void createProduct(@RequestParam(value = "loginid") Long loginId, 
							  @RequestParam(value = "pid") Long pId) {
		RentService.rentProduct(loginId,pId);

	}

}
