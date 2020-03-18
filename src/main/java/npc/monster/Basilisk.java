package npc.monster;

import interfaces.Drops;
import npc.monster.drops.BasiliskEye;
import npc.monster.drops.BasiliskScale;

import java.util.Random;

public class Basilisk extends Monster implements Drops {
    BasiliskEye basiliskEye = new BasiliskEye();
    BasiliskScale basiliskScale = new BasiliskScale();
    Random random = new Random();


    public Basilisk(int HP, int level) {
        super(HP, level);
        this.name = "Basilisk";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(5);
        return damage;
    }

    public String speak() {
        return "Grrrrrrrrr";
    }

    @Override
    public void drop() {
        int roll = random.nextInt(100);
        if ( roll < 50){
            basiliskEye.addToLootTable();
        }
        if (roll >= 50){
            basiliskScale.addToLootTable();
        }
    }
}
