package npc.monster;

import npc.monster.drops.Item;
import org.junit.Assert;
import org.junit.Test;

public class KoboldTest {
//    @Test
//
//    public void testAttack() {
//        Kobold kobold = new Kobold(15,  3);
//        int damageDone = 2;
//        int expected = damageDone;
//            int actual = kobold.attack();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public  void testSpeak(){
        Kobold kobold = new Kobold(15,  3);
        String expected = "You no take candle!";
        String actual = kobold.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Kobold kobold = new Kobold(8,  3);
        int expected = 16;
        kobold.setXpDrop();
        int actual = kobold.getXpDrop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDrop(){
        Kobold kobold = new Kobold(8, 3);
        kobold.drop();
        int expected = 1;

        Assert.assertEquals(expected, Item.dropTable.size());

    }
}
