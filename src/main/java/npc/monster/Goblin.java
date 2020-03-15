package npc.monster;

import npc.NPC;

import java.util.Random;

public class Goblin extends Monster {

    public Goblin(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
    }

    public String speak() {
        return "My precious!";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(2);
        return damage;
    }
}
