package npc.monster;

import java.util.Random;

public class Djiin extends Monster {
    public Djiin(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
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
