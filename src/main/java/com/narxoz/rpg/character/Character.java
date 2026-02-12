package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;

public abstract class Character {
    protected String name;
    protected int health, mana, strength, intelligence;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name) { this.name = name; }

    public void equip(Weapon w, Armor a) { 
        this.weapon = w; 
        this.armor = a; 
    }

    // Тот самый метод, которого не хватает в Main:
    public void getStats() {
        System.out.println("--- " + name + " (" + this.getClass().getSimpleName() + ") ---");
        System.out.println("HP: " + health + " | MP: " + mana + " | STR: " + strength + " | INT: " + intelligence);
        if (weapon != null && armor != null) {
            System.out.println("Equipped: " + weapon.getWeaponInfo() + " & " + armor.getArmorInfo());
        }
    }

    public abstract void useSpecialAbility();
}