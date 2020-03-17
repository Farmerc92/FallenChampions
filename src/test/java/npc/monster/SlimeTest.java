package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class SlimeTest {
    @Test

    public void testAttack() {
        Slime slime = new Slime(15,  3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = slime.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Slime slime = new Slime(15,  3);
        String expected = null;
        String actual = slime.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Slime slime = new Slime(8,  3);
        int expected = 16;
        slime.setXpDrop();
        int actual = slime.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
