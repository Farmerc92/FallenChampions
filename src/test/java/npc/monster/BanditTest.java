package npc.monster;


import org.junit.Assert;
import org.junit.Test;

public class BanditTest {

    @Test
    public void testAttack() {
        Bandit bandit = new Bandit(15, 3, 5, 1, 3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = bandit.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test(){
    }
}
