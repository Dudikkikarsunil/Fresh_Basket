package com.ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id@GeneratedValue
	private int id;
	private String prodName;
	private String prodText;
	private double price;
	private String imgSrc;
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public Product(int id, String prodName, String prodText, double price, String imgSrc) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodText = prodText;
		this.price = price;
		this.imgSrc = imgSrc;
	}
	public Product(int id, String prodName, String prodText, double price) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodText = prodText;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdText() {
		return prodText;
	}
	public void setProdText(String prodText) {
		this.prodText = prodText;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodText=" + prodText + ", price=" + price
				+ ", imgSrc=" + imgSrc + "]";
	}
	
	

}
