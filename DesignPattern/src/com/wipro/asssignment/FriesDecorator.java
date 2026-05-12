package com.wipro.asssignment;

public class FriesDecorator extends BurgerDecorator {

    public FriesDecorator(Burger burger){
        super(burger);
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+ " + French Fries";
    }
    @Override
    public int cost(){
        return burger.cost()+40;
    }
}
