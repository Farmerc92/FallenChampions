package npc.monster;

import interfaces.Drops;
import npc.NPC;
import npc.monster.drops.Apple;
import npc.monster.drops.Candle;

import java.util.Random;

public class Kobold extends Monster implements Drops {
    Candle candle = new Candle();
    Apple apple = new Apple();
    Random random = new Random();


    public Kobold(int HP, int level) {
        super(HP, level);
        this.name = "Kobold";
    }

    public String speak() {
        return "You no take candle!";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(2);
        return damage;
    }


    @Override
    public void drop() {
        if ( random.nextInt(100) < 50){
            candle.addToLootTable();
        } else {
            apple.addToLootTable();
        }
    }

}
