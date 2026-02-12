package com.narxoz.rpg.character;
public class Mage extends Character {
    public Mage(String name) { super(name); health=70; mana=150; strength=20; intelligence=90; }
    public void useSpecialAbility() { System.out.println("Special Ability: Arcane Blast!"); }
}