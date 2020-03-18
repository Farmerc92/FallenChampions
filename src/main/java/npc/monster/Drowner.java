package npc.monster;

import interfaces.Drops;
import npc.NPC;

import java.util.Random;

public class Drowner extends Monster implements Drops {
    Random random = new Random();


    public Drowner(int HP, int level) {
        super(HP, level);
        this.name = "Drowner";
    }

    public String speak() {
        return null;
    }

    public int attack() {
        int damage;
        damage = random.nextInt(8);
        return damage;
    }

    @Override
    public void drop() {

    }
}
