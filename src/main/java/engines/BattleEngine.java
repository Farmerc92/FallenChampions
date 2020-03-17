package engines;

import io.BattleIO;
import npc.monster.Monster;
import player.Player;

public class BattleEngine {
    private Player player;
    private Monster monster;
    private Thread threadMonster;
    private BattleIO io;

    public BattleEngine(Player player, Monster monster){
        this.player = player;
        this.monster = monster;
        io = new BattleIO(player, monster);
        threadMonster = new Thread();
    }

    public int playerTurn(){
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

    public boolean battle(){
        while (player.getCurrentHp() > 0 && monster.getCurrentHP() > 0) {
            playerTurn();
            if (monster.getCurrentHP() > 0)
                monsterTurn();
        }
        return player.getCurrentHp() > 0;
    }
}
