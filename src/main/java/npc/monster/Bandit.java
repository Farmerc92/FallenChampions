package npc.monster;

import player.Inventory;
import Money.Coin;
import Money.CoinPouch;
import interfaces.Drops;

import java.util.Random;


public class Bandit extends Monster implements Drops {
    public Bandit(int HP, int level) {
        super(HP, level);
        this.name = "Bandit";

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
    public void drop() {
        Random random = new Random();
        CoinPouch playerPouch = new CoinPouch();
        int roll = random.nextInt(100);
        if (roll < 100){
            playerPouch.addCurrency(Coin.COPPER,15);
        }
    }
}
