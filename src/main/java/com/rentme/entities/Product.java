package com.rentme.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name= "name")
    private String name;

    @Column(name = "description")
    private String description;
    
    @Column(name = "uploadDate")
    private Date uploadDate;

    @Column(name= "rentedIndicator")
    private Boolean rentedIndicator;
    
    @Column(name= "rentCount")
    private int rentCount;
    
    @Column(name= "imageHttp")
    private String imageHttp;
    
    @Column(name= "pricePerDay")
    private String pricePerDay;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uploadedByuserid", nullable = false)
    private UserSignupEntity userSignup;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public UserSignupEntity getUserSignup() {
		return userSignup;
	}

	public void setUserSignup(UserSignupEntity userSignup) {
		this.userSignup = userSignup;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", uploadDate=" + uploadDate
				+ ", rentedIndicator=" + rentedIndicator + ", rentCount=" + rentCount + ", imageHttp=" + imageHttp
				+ ", pricePerDay=" + pricePerDay + ", userSignup=" + userSignup + "]";
	}

    
}
