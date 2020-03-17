package npc.monster;

import npc.NPC;

import java.util.Random;

public class Drowner extends Monster {


    public Drowner(int HP, int level) {
        super(HP, level);
        this.name = "Drowner";
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
