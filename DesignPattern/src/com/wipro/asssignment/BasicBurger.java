package com.wipro.asssignment;


public class BasicBurger implements Burger {
    @Override
    public String getDescription(){
        return "Basic Burger";
    }
    @Override
    public int cost(){
        return 120;
    }
}
