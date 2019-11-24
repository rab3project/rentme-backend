package com.rentme.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.UserSignupDto;
import com.rentme.entities.UserLoginEntity;
import com.rentme.entities.UserSignupEntity;
import com.rentme.repositories.UserLoginRepository;


@Service
public class UserSignupService {

	
	@Autowired 
	private UserLoginRepository uLRepository; 
	
	public void createUser(UserSignupDto sDto) {
		// TODO Auto-generated method stub
		
		UserLoginEntity lentity = new UserLoginEntity();
		lentity.setUsername(sDto.getUsername());
		lentity.setPassword(sDto.getPassword());
		lentity.setCeatedAt(new Date());
		lentity.setLastSignOn(new Date());
			
			
		UserSignupEntity sEntity = new UserSignupEntity();
		sEntity.setName(sDto.getName());
	    sEntity.setEmail(sDto.getEmail());
		//sEntity.setConfirmEmail(sDto.getConfirmEmail());
		//sEntity.setDob(sDto.getDob());
		sEntity.setPhone(sDto.getPhone());
		sEntity.setAddress(sDto.getAddress());
		sEntity.setCreatedAt(new Date());
		sEntity.setActive(1L);
		
		
		lentity.setUser(sEntity);
		
		uLRepository.save(lentity);
		
	}

}
