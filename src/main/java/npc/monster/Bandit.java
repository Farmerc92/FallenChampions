package npc.monster;

import java.util.Random;

public class Bandit extends Monster {
    public Bandit(int HP, int strength, int dexterity, int intelligence, int level) {
        super(HP, strength, dexterity, intelligence, level);
    }

    public int attack() {
        Random random = new Random();
        int damage;
        damage = random.nextInt(4);
        return damage;
    }

    public String speak() {
        return null;
    }
}
