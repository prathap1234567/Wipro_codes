package com.wipro.asssignment;

public class CokeDecorator extends BurgerDecorator {
    public CokeDecorator(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+"+ Coke";
    }
    @Override
    public int cost(){
        return burger.cost()+30;
    }
}
