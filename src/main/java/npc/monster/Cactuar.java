package npc.monster;

import java.util.Random;

public class Cactuar extends Monster {


    public Cactuar(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
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
