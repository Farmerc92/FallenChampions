package npc.monster;

import interfaces.Drops;
import npc.NPC;
import npc.monster.drops.VialOfSlime;

import java.util.Random;

public class Slime extends Monster implements Drops {
    Random random = new Random();
    VialOfSlime vialOfSlime = new VialOfSlime();


    public Slime(int HP, int level) {
        super(HP, level);
        this.name = "Slime";
    }

    public String speak() {
        return null;
    }

    public int attack() {
        int damage;
        damage = random.nextInt(1);
        return damage;
    }

    @Override
    public void drop() {
        int roll = random.nextInt(100);
        if (roll <= 100){
            vialOfSlime.addToLootTable();
        }
    }
}
