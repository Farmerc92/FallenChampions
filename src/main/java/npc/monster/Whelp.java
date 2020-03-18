package npc.monster;

import interfaces.Drops;
import npc.NPC;
import npc.monster.drops.FlameSack;
import npc.monster.drops.WhelpEye;
import npc.monster.drops.WhelpScale;

import java.util.Random;

public class Whelp extends Monster implements Drops {
    Random random = new Random();
    WhelpEye whelpEye = new WhelpEye();
    WhelpScale whelpScale = new WhelpScale();
    FlameSack flameSack = new FlameSack();


    public Whelp(int HP, int level) {
        super(HP, level);
        this.name = "Whelp";
    }

    public String speak() {
        return "Kreeeeee!";
    }

    public int attack() {
        int damage;
        damage = random.nextInt(20);
        return damage;
    }

    @Override
    public void drop() {
        int roll = random.nextInt(100);
        if (roll < 50){
            whelpEye.addToLootTable();
        }
        if (roll >= 50 && roll < 75){
            whelpScale.addToLootTable();
        } else {
            flameSack.addToLootTable();
        }
    }
}
