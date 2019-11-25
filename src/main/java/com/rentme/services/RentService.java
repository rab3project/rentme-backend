package com.rentme.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.ProductDto;
import com.rentme.entities.ProductEntity;
import com.rentme.repositories.ProductRepository;
import com.rentme.repositories.RentRepository;

@Service
public class RentService {

	@Autowired
	private ProductRepository pRepository;
	
	@Autowired 
	private RentRepository rRepository;

	public List<ProductDto> viewAll() {

		List<ProductEntity> productEntity = (List<ProductEntity>) pRepository.findAll();
		List<ProductDto> pDtos = new ArrayList<ProductDto>();

		ProductDto pDto = new ProductDto();
		for (ProductEntity pEntity : productEntity) {
			pDto.setAll(pEntity.getName(), pEntity.getDescription(), pEntity.getImageHttp(), pEntity.getRentCount(),
					pEntity.getPricePerDay());
			pDtos.add(pDto);
		}

		return pDtos;

	}

	public static void rentProduct(Long logId, Long pId) {
		// TODO Auto-generated method stub
		
		
	}

}
