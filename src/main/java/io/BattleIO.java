package io;

import npc.monster.Monster;
import player.Player;

public class BattleIO {
    private Player player;
    private Monster monster;

    public BattleIO(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    public void playerAttack(String name, int damage){
        if (monster.getCurrentHP() - damage > 0)
            System.out.println("Your attack damages the " + name + " for " + damage + "!");
        else
            System.out.println("Your attack kills the " + name + "!");
    }

    public void monsterAttack(String name, int damage){
        if (player.getCurrentHp() - damage > 0)
            System.out.println("The " + name + "'s attack damages you for " + damage + "!" +
                    "\nYour current hp is now " + (player.getCurrentHp() - damage));
        else
            System.out.println("The " + name + "'s attack damages you for " + damage + "!" +
                    "\nYou have run out of hp!");
    }
}
