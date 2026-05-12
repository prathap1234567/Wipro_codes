package com.wipro.basic;

public class Car {
 double price;
 String brand;
 int type;
 public Car(double price, String brand, int type) {
	super();
	this.price = price;
	this.brand = brand;
	this.type = type;
}
 @Override
public String toString() {
	return "Car [price=" + price + ", brand=" + brand + ", type=" + type + "]";
}
}
