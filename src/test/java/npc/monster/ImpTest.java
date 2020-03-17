package npc.monster;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ImpTest {
//    @Test
//    public void testAttack() {
//        Imp imp = new Imp(15, 1);
//        int damageDone = 2;
//        int expected = damageDone;
//        int actual = imp.attack();
//
//        Assert.assertEquals(, actual);
//    }

    @Test
    public  void testSpeak(){
        Imp imp = new Imp(15, 1);
        String expected = null;
        String actual = imp.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop(){
        Imp imp = new Imp(15, 1);
        int expected = 30;
        imp.setXpDrop();
        int actual = imp.getXpDrop();

        Assert.assertEquals(expected, actual);

    }
}
