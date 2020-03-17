package npc.monster;

import java.util.Random;

public class Cactuar extends Monster {


    public Cactuar(int HP, int level) {
        super(HP, level);
        this.name = "Cactuar";
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(6);
        return damage;
    }
    public String speak() {
        return null;
    }
}
