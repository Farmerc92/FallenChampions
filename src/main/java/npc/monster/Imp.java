package npc.monster;

import java.util.Random;

public class Imp extends Monster {

    public Imp(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
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
