package npc.monster;

import java.util.Random;

public class Djiin extends Monster {
    public Djiin(int HP, int level) {
        super(HP, level);
        this.name = "Djiin";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(7);
        return damage;
    }

    public String speak() {
        return null;
    }
}
