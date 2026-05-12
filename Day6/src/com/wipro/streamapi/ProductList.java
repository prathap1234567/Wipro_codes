package com.wipro.streamapi;

public class ProductList {

	private String prodName;
	private String prodCat;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCat() {
		return prodCat;
	}
	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String make;
	private double price;
	public ProductList(String prodName, String prodCat, String make, double price) {
		super();
		this.prodName = prodName;
		this.prodCat = prodCat;
		this.make = make;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductList [prodName=" + prodName + ", prodCat=" + prodCat + ", make=" + make + ", price=" + price
				+ "]";
	}
	
}
