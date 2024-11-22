package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("coffee, prix : " + coffee.cost() + " description : "+ coffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("coffee milk, prix : " + milkCoffee.cost() + " description : "+ milkCoffee.getDescription());


        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("coffee milk sugar, prix : " + sugarCoffee.cost() + " description : "+ sugarCoffee.getDescription());



    }
}
