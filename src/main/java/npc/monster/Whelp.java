package npc.monster;

import npc.NPC;

import java.util.Random;

public class Whelp extends Monster {
    public Whelp(int HP, int level) {
        super(HP, level);
        this.name = "Whelp";
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
