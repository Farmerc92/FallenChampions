package npc.monster;

import npc.NPC;

import java.util.Random;

public class Slime extends Monster {
    public Slime(int HP, int level) {
        super(HP, level);
        this.name = "Slime";
    }

    public String speak() {
        return null;
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(1);
        return damage;
    }
}
