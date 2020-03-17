package npc.monster;

import java.util.Random;

public class Basilisk extends Monster {
    public Basilisk(int HP, int level) {
        super(HP, level);
        this.name = "Basilisk";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(5);
        return damage;
    }

    public String speak() {
        return "Grrrrrrrrr";
    }
}
