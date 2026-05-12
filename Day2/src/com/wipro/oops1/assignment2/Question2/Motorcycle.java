package com.wipro.oops1.assignment2.Question2;

 public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineSizeCC;
    public Motorcycle(String make, String model, int year, boolean hasSidecar, int engineSizeCC) {
        super(make, model, year); 
        this.hasSidecar = hasSidecar;
        this.engineSizeCC = engineSizeCC;
    }
    public void startEngine() {
        System.out.println("Motorcycle engine starting..Vroom!");
    }
    
    public void stopEngine() {
        System.out.println("Motorcycle engine stopping..");
    }
    
    public void wheelie() {
        System.out.println("Motorcycle performing a wheelie!");
    }
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Has Side car: " + hasSidecar);
        System.out.println("Engine Size(CC): " + engineSizeCC);
    }
}