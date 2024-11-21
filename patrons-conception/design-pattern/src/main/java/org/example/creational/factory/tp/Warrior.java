package org.example.creational.factory.tp;

public class Warrior extends Character{

    public Warrior(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("warrior shoots");
    }
}
