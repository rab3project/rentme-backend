package com.rentme.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "rentedItems")
public class RentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "rentFromDate")
	private Date  rentFromDate;

	@Column(name = "rentToDate")
	private Date  rentToDate;

	@Column(name = "totalPrice")
	private Date lastSignOn;

	@Column(name = "created_at")
	private Date createdAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rentedByUserLId", nullable = false)
	private UserLoginEntity userLoginEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rentedProductId", nullable = false)
	private ProductEntity pEntity ;
	
}
