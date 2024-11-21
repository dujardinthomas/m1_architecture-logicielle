package org.example.creational.factory.tp;

public class Main {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character warrior = characterFactory.getCharacter("warrior", "warrior0", 3, 5);
        Character mage = characterFactory.getCharacter("mage", "mage", 5, 7);
        Character archer = characterFactory.getCharacter("archer", "archer0", 2, 8);


        warrior.getNameCharacter();
        warrior.getAttack();
        warrior.getHealth();

        mage.getNameCharacter();
        mage.getAttack();
        mage.getHealth();

        archer.getNameCharacter();
        archer.getAttack();
        archer.getHealth();

        Character voleur = characterFactory.getCharacter("voleur", "voleurTest", 4,5);

        voleur.getNameCharacter();
        voleur.getAttack();
        voleur.getHealth();


    }
}
