package org.example.creational.factory.tp;

public abstract class Character {

    private String name;
    private int health;
    private int attack;


    public Character(String name, int attack, int health){
        this.setAttack(attack);
        this.setName(name);
        this.setHealth(health);
    }

    public void getNameCharacter(){
        System.out.println(name);
    }

    public void getHealth(){
        System.out.println(health);
    }

    public void getAttack(){
        System.out.println(attack);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String useSpecialSkill(){
        return "special skills ??";
    }
}
