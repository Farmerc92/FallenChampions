package npc.monster;

import interfaces.Drops;
import npc.NPC;
import npc.monster.drops.Candle;
import npc.monster.drops.Dropable;

import java.util.Random;

public class Goblin extends Monster implements Drops {
    Candle candle = new Candle();
    Random random = new Random();


    public Goblin(int HP, int level) {
        super(HP, level);
        this.name = "Goblin";
    }

    public String speak() {
        return "My precious!";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(2);
        return damage;
    }

    @Override
    public void drop() {
        candle.addToLootTable();
    }
}
