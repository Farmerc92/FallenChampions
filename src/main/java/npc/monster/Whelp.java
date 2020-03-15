package npc.monster;

import npc.NPC;

import java.util.Random;

public class Whelp extends Monster {
    public Whelp(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
    }

    public String speak() {
        return "Kreeeeee!";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(20);
        return damage;
    }
}
