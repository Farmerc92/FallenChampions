package npc.monster;

import npc.NPC;

import java.util.Random;

public class Goblin extends Monster {

    public Goblin(int HP, int level) {
        super(HP, level);
        this.name = "Goblin";
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
