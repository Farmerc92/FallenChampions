package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class ImpTest {
    @Test
    public void testAttack() {
        Imp imp = new Imp(15, 3, 5, 1, 3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = imp.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Imp imp = new Imp(15, 3, 5, 1, 3);
        String expected = null;
        String actual = imp.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop(){
        Imp imp = new Imp(15, 3, 5, 1, 3);
        int expected = 30;
        imp.setXpDrop();
        int actual = imp.getXpDrop();

        Assert.assertEquals(expected, actual);

    }
}
