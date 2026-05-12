package com.wipro.collections;

import java.util.Objects;

public class MobileSetDemo {
    String model;
	int modelNumber;
	int price;
	
	public MobileSetDemo(String model, int modelNumber, int price) {
		super();
		this.model = model;
		this.modelNumber = modelNumber;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MobileSetDemo [model=" + model + ", modelNumber=" + modelNumber + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(modelNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileSetDemo other = (MobileSetDemo) obj;
		return modelNumber == other.modelNumber;
	}
	
}
