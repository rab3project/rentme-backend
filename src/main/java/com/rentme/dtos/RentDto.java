package com.rentme.dtos;

import java.util.Date;


public class RentDto {
	
	private Date rentFromDate;
	
	private Date rentToDate ;
	
	private double totalPrice ;
	
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
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "RentDto [rentFromDate=" + rentFromDate + ", rentToDate=" + rentToDate + ", totalPrice=" + totalPrice
				+ ", rentedByUserLId=" + "]";
	}
	

}
