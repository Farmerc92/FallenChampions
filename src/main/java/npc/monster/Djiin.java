package npc.monster;

import interfaces.Drops;
import npc.monster.drops.Dropable;
import npc.monster.drops.VialOfWater;

import java.util.Random;

public class Djiin extends Monster implements Drops {
    VialOfWater vialOfWater = new VialOfWater();
    Random random = new Random();


    public Djiin(int HP, int level) {
        super(HP, level);
        this.name = "Djiin";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(7);
        return damage;
    }

    public String speak() {
        return null;
    }

    @Override
    public void drop() {
        vialOfWater.addToLootTable();
    }
}
