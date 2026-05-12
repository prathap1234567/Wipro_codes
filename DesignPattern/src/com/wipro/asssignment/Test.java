package com.wipro.asssignment;

public class Test {
    public static void main(String[] args) {
        Burger burger= new BasicBurger();
        burger = new CheeseDecorator(burger);
        burger= new CokeDecorator(burger);
        System.out.println(burger.getDescription());
        System.out.println("Cost "+burger.cost());

    }
}
