package com.rentme.dtos;

import java.util.Date;



public class ProductDto {
	private String name;

	private String description;

	private Date uploadDate;

	private Boolean rentedIndicator;

	private int rentCount;

	private String imageHttp;

	private String pricePerDay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Boolean getRentedIndicator() {
		return rentedIndicator;
	}

	public void setRentedIndicator(Boolean rentedIndicator) {
		this.rentedIndicator = rentedIndicator;
	}

	public int getRentCount() {
		return rentCount;
	}

	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}

	public String getImageHttp() {
		return imageHttp;
	}

	public void setImageHttp(String imageHttp) {
		this.imageHttp = imageHttp;
	}

	public String getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(String pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	
}
