package com.rentme.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private long ProductId;

    @Column(name= "name")
    private String Name;

    @Column(name = "description")
    private String Description;

    private Date date;

    private double PricePerDay;

    public Product() {
    }

    public long getProductId() {

        return ProductId;
    }

    public void setProductId(long productId) {

        ProductId = productId;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getDescription() {

        return Description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {

        Description = description;
    }

    public double getPricePerDay() {

        return PricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {

        PricePerDay = pricePerDay;
    }
}