package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class DjiinTest {
    @Test

    public void testAttack() {
        Djiin djiin = new Djiin(15, 3, 5, 1, 3);
        int damageDone = 2;
        int expected = damageDone;
        int actual = djiin.attack();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testSpeak(){
        Djiin djiin = new Djiin(15, 3, 5, 1, 3);
        String expected = null;
        String actual = djiin.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Djiin djiin = new Djiin(35, 3, 5, 1, 3);
        int expected = 70;
        djiin.setXpDrop();
        int actual = djiin.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
