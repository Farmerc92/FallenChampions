package npc.monster;

import Money.Coin;
import npc.monster.drops.Dropable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class BanditTest {


    @Test
    public void testAttack() {
        Random random = new Random();
        Bandit bandit = new Bandit(15, 3, 5, 1, 3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = bandit.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Bandit bandit = new Bandit(15, 3, 5, 1, 3);
        String expected = "Give me all your stuffs!";
        String actual = bandit.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop(){
        Bandit bandit = new Bandit(15, 3, 5, 1, 3);
        int expected = 30;
        bandit.setXpDrop();
        int actual = bandit.getXpDrop();

        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void testDrop(){
//        Bandit bandit = new Bandit(15, 3, 5, 1, 3);
//        Dropable expected = Coin.SILVER;
//        Dropable actual = bandit.drop();
//
//        Assert.assertEquals(expected,actual);
//    }
}
