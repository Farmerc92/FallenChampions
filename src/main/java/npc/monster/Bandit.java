package npc.monster;

import player.Inventory;
import Money.Coin;
import Money.CoinPouch;
import interfaces.Drops;
import npc.monster.drops.Dropable;

import java.util.Random;

public class Bandit extends Monster implements Drops {
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
        return "Give me all your stuffs!";
    }

    @Override
    public Dropable drop() {
        Random random = new Random();
        int roll = random.nextInt(100);
        if (roll < 50){
            return null;
        }
        if (roll > 50){
            return Coin.SILVER;
        }
        return null;
    }
}
