package com.wipro.asssignment;

public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger){
        super(burger);
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+" + Cheese ";
    }
    @Override
    public int cost(){
        return burger.cost()+30;
    }
}
