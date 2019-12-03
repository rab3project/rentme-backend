package com.rentme.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.CustomerSignupDto;
import com.rentme.dtos.UserSignupDto;
import com.rentme.entities.UserLoginEntity;
import com.rentme.entities.UserEntity;
import com.rentme.repositories.UserLoginRepository;


@Service
public class UserSignupService {

	
	@Autowired 
	private UserLoginRepository uLRepository; 
	
	public void createUser(CustomerSignupDto customerSignupDto) {
		
		UserLoginEntity lentity = new UserLoginEntity();
		lentity.setUsername(customerSignupDto.getLoginDto().getUsername());
		lentity.setPassword(customerSignupDto.getLoginDto().getPassword());
		lentity.setCreatedAt(new Date());
		//lentity.setLastSignOn(new Date());
			
			
		UserEntity sEntity = new UserEntity();
		sEntity.setName(customerSignupDto.getName());
	    sEntity.setEmail(customerSignupDto.getEmail());
		//sEntity.setConfirmEmail(sDto.getConfirmEmail());
		//sEntity.setDob(sDto.getDob());
		sEntity.setPhone(customerSignupDto.getPhone());
		//sEntity.setAddress(customerSignupDto.getAddress());
		sEntity.setCreatedAt(new Date());
		sEntity.setActive(1L);
		
		
		lentity.setUser(sEntity);
		
		uLRepository.save(lentity);
		
	}

}
