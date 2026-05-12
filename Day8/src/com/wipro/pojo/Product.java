package com.wipro.pojo;

public class Product {
	String productName;
	double price;
	@Override
	public String toString() {
		return "product [productName=" + productName + ", price=" + price + "]";
	}
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
