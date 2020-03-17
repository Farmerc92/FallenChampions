package npc.monster;

import npc.monster.drops.Dropable;

import java.util.Random;

public class Bandit extends Monster implements Dropable {
    public Bandit(int HP, int level) {
        super(HP, level);
        this.name = "Bandit";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(4);
        return damage;
    }

    public String speak() {
        return "Give me all your stuffs!";
    }
}
