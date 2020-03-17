package npc.monster;

import java.util.Random;

public class Imp extends Monster {

    public Imp(int HP, int level) {
        super(HP, level);
        this.name = "Imp";
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
