package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class BasiliskTest {
    @Test

    public void testAttack() {
        Basilisk basilisk = new Basilisk(15,  3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = basilisk.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Basilisk basilisk = new Basilisk(15,  3);
        String expected = "Grrrrrrrrr";
        String actual = basilisk.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop(){
        Basilisk basilisk = new Basilisk(40,  3);
        int expected = 80;
        basilisk.setXpDrop();
        int actual = basilisk.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
