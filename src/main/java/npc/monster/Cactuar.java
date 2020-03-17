package npc.monster;

import interfaces.Drops;
import npc.monster.drops.Apple;
import npc.monster.drops.VialOfWater;

import java.util.Random;

public class Cactuar extends Monster implements Drops {
    Apple apple = new Apple();
    VialOfWater vialOfWater = new VialOfWater();
    Random random = new Random();


    public Cactuar(int HP, int level) {
        super(HP, level);
        this.name = "Cactuar";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(6);
        return damage;
    }
    public String speak() {
        return null;
    }

    @Override
    public void drop() {
        int roll = random.nextInt(100);

        if (roll < 50){
            apple.addToLootTable();
        } else {
            vialOfWater.addToLootTable();
        }

    }
}
