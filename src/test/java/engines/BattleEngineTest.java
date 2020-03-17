package engines;

import npc.monster.Monster;
import npc.monster.Slime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.Player;

public class BattleEngineTest {
    private BattleEngine battleEngine;
    private Player player;
    private Monster monster;

    @Before
    public void init(){
        player = new Player("Takami");
        monster = new Slime(10, 1);
    }

    @Test
    public void battleTest1(){
        battleEngine = new BattleEngine(player, monster);
        Assert.assertTrue(battleEngine.battle());
    }
}
