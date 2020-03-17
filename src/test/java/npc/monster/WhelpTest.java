package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class WhelpTest {
//    @Test
//
//    public void testAttack() {
//        Whelp whelp = new Whelp(15, 3);
//        int damageDone = 2;
//        int expected = damageDone;
//        int actual = whelp.attack();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public  void testSpeak(){
        Whelp whelp = new Whelp(15, 3);
        String expected = "Kreeeeee!";
        String actual = whelp.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Whelp whelp = new Whelp(132,  24);
        int expected = 264;
        whelp.setXpDrop();
        int actual = whelp.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
