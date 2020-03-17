package engines;

import io.BattleIO;
import npc.monster.Monster;
import player.Player;

public class BattleEngine {
    private Player player;
    private Monster monster;
    private BattleIO io;

    public BattleEngine(Player player, Monster monster){
        this.player = player;
        this.monster = monster;
        io = new BattleIO(player, monster);
    }

    public int playerTurn(){
        Integer input = io.getIntegerInput(io.attackChoice());
        if (input == 1)
            return playerAttack();
        else if (input == 2){
            Integer inputSkill = io.getIntegerInput(io.skillChoice());
            return playerSkill(inputSkill);
        }
        return playerTurn();
    }
    //Will add skills later to then use in combat
    private int playerSkill(Integer inputSkill) {
        return playerAttack();
    }

    public int playerAttack(){
        int damage = player.attack();
        io.playerAttack(monster.getName(), damage);
        monster.damageHP(damage);
        return damage;
    }

    public int monsterTurn(){
        int damage = monster.attack();
        io.monsterAttack(monster.getName(), damage);
        player.takeDamage(damage);
        return damage;
    }

    public boolean attackOrder(){
        return player.getLevel() >= monster.getLevel();
    }

    public boolean battle(){
        while (player.getCurrentHp() > 0 && monster.getCurrentHP() > 0) {
            if (attackOrder())
                playerFirst();
            else
                monsterFirst();
        }
        return player.getCurrentHp() > 0;
    }

    public void playerFirst(){
        delay();
        playerTurn();
        delay();
        if (monster.getCurrentHP() > 0)
            monsterTurn();
    }

    public void monsterFirst(){
        delay();
        monsterTurn();
        delay();
        if (player.getCurrentHp() > 0)
            playerTurn();
    }

    public boolean delay(){
        try {
            Thread.sleep(2000);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
