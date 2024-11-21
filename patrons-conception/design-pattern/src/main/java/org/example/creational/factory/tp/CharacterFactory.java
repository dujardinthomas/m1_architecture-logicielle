package org.example.creational.factory.tp;

public class CharacterFactory {

    public Character getCharacter(String characterType, String name, int attack, int health){
        if(characterType.equalsIgnoreCase("warrior")){
            return new Warrior(name, attack , health);
        }
        if(characterType.equalsIgnoreCase("mage")){
            return new Mage(name, attack , health);
        }
        if(characterType.equalsIgnoreCase("archer")){
            return new Archer(name, attack , health);
        }
        if(characterType.equalsIgnoreCase("voleur")){
            return new Voleur(name, attack , health);
        }
        return null;
    }
}
