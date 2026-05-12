package com.wipro.asssignment;

public class PattyDecorator extends BurgerDecorator {
    public PattyDecorator(Burger burger){
        super(burger);
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+" + Extra Patty";
    }
    @Override
    public int cost(){
        return burger.cost()+50;
    }

}