package org.example.creational.factory.tp;

public class Voleur extends Character{
    public Voleur(String name, int attack, int health) {
        super(name, attack, health);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("voleur shoots");
    }
}
