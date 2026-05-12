package com.wipro.oops1.inheritance;

public class DellLaptop extends Laptop{
 
  String delSpecialFeature;

  public DellLaptop(String make, String model, String delspecialFeature) {
	super(make, model);
	// TODO Auto-generated constructor stub
	this.delSpecialFeature=delspecialFeature;
  }

  @Override
  public String toString() {
	return "DellLaptop [delSpecialFeature=" + delSpecialFeature + ", make=" + make + ", model=" + model + "]";
  }
  
  
}
