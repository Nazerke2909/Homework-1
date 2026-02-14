package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- RPG Character Creation System ----\n");

        CharacterFactory warriorCreator = new WarriorFactory();
        Character warrior = warriorCreator.createCharacter("Ludolf");
        warrior.equip(new MedievalFactory().createWeapon(), new MedievalFactory().createArmor());
        warrior.getStats();
        warrior.useSpecialAbility();

        System.out.println("\n---");

        CharacterFactory mageCreator = new MageFactory();
        Character mage = mageCreator.createCharacter("Rhen");
        mage.equip(new MagicFactory().createWeapon(), new MagicFactory().createArmor());
        mage.getStats();
        mage.useSpecialAbility();

        System.out.println("\n---");

        CharacterFactory archerCreator = new ArcherFactory();
        Character archer = archerCreator.createCharacter("Laila");
        archer.equip(new RangerFactory().createWeapon(), new RangerFactory().createArmor());
        archer.getStats();
        archer.useSpecialAbility();
        
    }
}