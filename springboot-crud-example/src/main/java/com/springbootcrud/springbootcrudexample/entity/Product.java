package com.springbootcrud.springbootcrudexample.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "PRODUCT_TBL")
public class Product {

    @jakarta.persistence.Id
    private int id;
    private String name;
    private int quantity;
    private double price;
	public Integer getId() {
		
		return this.id;
	}
	public String getName() {
		
		return this.name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name2) {
		this.name=name2;
		
	}
	
	
	}
	
	
	
