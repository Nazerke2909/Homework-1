package com.narxoz.rpg.character;
public class Archer extends Character {
    public Archer(String name) { super(name); health=100; mana=60; strength=50; intelligence=50; }
    public void useSpecialAbility() { System.out.println("Special Ability: Eagle Eye!"); }
}