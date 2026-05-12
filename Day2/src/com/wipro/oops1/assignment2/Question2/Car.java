package com.wipro.oops1.assignment2.Question2;

public class Car extends Vehicle {
    private int numDoors;
    private String fuelType;
    public Car(String make, String model, int year, int numDoors, String fuelType) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    public void startEngine() {
        System.out.println("Car engine starting..");
    }

   
    public void stopEngine() {
        System.out.println("Car engine stopping...");
    }

    public void accelerate() {
        System.out.println("Car accelerating..");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Num of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}