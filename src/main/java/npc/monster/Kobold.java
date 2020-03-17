package npc.monster;

import npc.NPC;

import java.util.Random;

public class Kobold extends Monster {

    public Kobold(int HP, int level) {
        super(HP, level);
        this.name = "Kobold";
    }

    public String speak() {
        return "You no take candle!";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(2);
        return damage;
    }
}
