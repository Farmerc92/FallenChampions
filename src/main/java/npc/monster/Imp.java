package npc.monster;

import interfaces.Drops;
import npc.monster.drops.*;

import java.util.Random;

public class Imp extends Monster implements Drops {
    WhiteBead whiteBead = new WhiteBead();
    RedBead redBead = new RedBead();
    BlackBead blackBead = new BlackBead();
    YellowBead yellowBead = new YellowBead();
    Random random = new Random();


    public Imp(int HP, int level) {
        super(HP, level);
        this.name = "Imp";
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
        if (roll <= 25){
            whiteBead.addToLootTable();
        }
        if (roll > 25 && roll <= 50){
            redBead.addToLootTable();
        }
        if (roll > 50 && roll <= 75){
            blackBead.addToLootTable();
        }
        else if (roll > 75){
            yellowBead.addToLootTable();
        }
    }
}
