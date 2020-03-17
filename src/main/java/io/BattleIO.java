package io;

import npc.monster.Monster;
import player.Player;

public class BattleIO extends PlayerIO{
    private Player player;
    private Monster monster;

    public BattleIO(Player player, Monster monster) {
        super(System.in, System.out);
        this.player = player;
        this.monster = monster;
    }

    public void playerAttack(String name, int damage){
        if (monster.getCurrentHP() - damage > 0)
            System.out.println("Your attack damages the " + name + " for " + damage + "!" +
                    "\nThe " + name + "'s hp is now " + (monster.getCurrentHP() - damage) + ".\n");
        else
            System.out.println("Your attack kills the " + name + "!\n");
    }

    public void monsterAttack(String name, int damage){
        if (player.getCurrentHp() - damage > 0)
            System.out.println("The " + name + "'s attack damages you for " + damage + "!" +
                    "\nYour current hp is now " + (player.getCurrentHp() - damage) + ".\n");
        else
            System.out.println("The " + name + "'s attack damages you for " + damage + "!" +
                    "\nYou have run out of hp!\n");
    }

    public String attackChoice(){
        return "Enter 1: Attack\nEnter 2: Skills Menu";
    }

    //When Skills are finished this will print out 1. Skill 1 \n 2. Skill 2 etc...
    public String skillChoice() {
        return "";
    }
}
