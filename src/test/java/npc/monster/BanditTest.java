package npc.monster;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BanditTest {


    @Test
    public void testAttack() {
        Bandit bandit = new Bandit(15,  3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = bandit.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Bandit bandit = new Bandit(15,  3);
        String expected = "Give me all your stuffs!";
        String actual = bandit.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop(){
        Bandit bandit = new Bandit(15,  3);
        int expected = 30;
        bandit.setXpDrop();
        int actual = bandit.getXpDrop();

        Assert.assertEquals(expected, actual);

    }
}
