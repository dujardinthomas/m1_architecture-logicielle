package org.example.creational.factory.tp;

public class Mage extends Character{
    public Mage(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("mage shoots");
    }
}
