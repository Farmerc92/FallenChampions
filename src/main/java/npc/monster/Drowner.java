package npc.monster;

import npc.NPC;

import java.util.Random;

public class Drowner extends Monster {


    public Drowner(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
    }

    public String speak() {
        return null;
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(8);
        return damage;
    }
}
