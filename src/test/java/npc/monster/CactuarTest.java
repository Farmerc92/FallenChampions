package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class CactuarTest {
    @Test

    public void testAttack() {
        Cactuar cactuar = new Cactuar(15, 3, 5, 1, 3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = cactuar.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Cactuar cactuar = new Cactuar(15, 3, 5, 1, 3);
        String expected = null;
        String actual = cactuar.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Cactuar cactuar = new Cactuar(14, 3, 5, 1, 3);
        int expected = 28;
        cactuar.setXpDrop();
        int actual = cactuar.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
