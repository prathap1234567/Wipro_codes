package com.wipro.collections;

import java.util.Objects;

public class Mobile {

	String model;
	int price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(model, other.model);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Mobile(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", price=" + price + "]";
	}
}
