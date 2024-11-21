package org.example.creational.factory.tp;

public class Archer extends Character{
    public Archer(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("archer shoots");
    }
}
