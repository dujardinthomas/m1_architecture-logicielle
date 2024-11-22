package org.example.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " milk";
    }

    @Override
    public double cost(){
        return coffee.cost() + 0.5;
    }
}
