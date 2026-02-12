package com.narxoz.rpg.character;
public class Warrior extends Character {
    public Warrior(String name) { super(name); health = 150; mana = 30; strength = 80; intelligence = 20; }
    public void useSpecialAbility() { System.out.println("Ability: Berserker Rage activated!"); }
}