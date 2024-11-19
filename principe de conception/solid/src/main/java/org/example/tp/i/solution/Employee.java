package org.example.tp.i.solution;

public class Employee implements Worker, Eater, Sleeper{

    String name;

    Employee(String name){
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " mange");
    }

    @Override
    public void sleep() {
        System.out.println(name + " dort");
    }

    @Override
    public void work() {
        System.out.println(name + " travaille");
    }
}
