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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRentFromDate() {
		return rentFromDate;
	}

	public void setRentFromDate(Date rentFromDate) {
		this.rentFromDate = rentFromDate;
	}

	public Date getRentToDate() {
		return rentToDate;
	}

	public void setRentToDate(Date rentToDate) {
		this.rentToDate = rentToDate;
	}

	public Date getLastSignOn() {
		return lastSignOn;
	}

	public void setLastSignOn(Date lastSignOn) {
		this.lastSignOn = lastSignOn;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public UserLoginEntity getUserLoginEntity() {
		return userLoginEntity;
	}

	public void setUserLoginEntity(UserLoginEntity userLoginEntity) {
		this.userLoginEntity = userLoginEntity;
	}

	public ProductEntity getpEntity() {
		return pEntity;
	}

	public void setpEntity(ProductEntity pEntity) {
		this.pEntity = pEntity;
	}

	@Override
	public String toString() {
		return "RentEntity [id=" + id + ", rentFromDate=" + rentFromDate + ", rentToDate=" + rentToDate
				+ ", lastSignOn=" + lastSignOn + ", createdAt=" + createdAt + ", userLoginEntity=" + userLoginEntity
				+ ", pEntity=" + pEntity + "]";
	}
	
	
	
}
