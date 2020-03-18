package npc.monster;

import npc.monster.drops.Item;
import org.junit.Assert;
import org.junit.Test;

public class DjiinTest {
//    @Test
//
//    public void testAttack() {
//        Djiin djiin = new Djiin(15,  3);
//        int damageDone = 2;
//        int expected = damageDone;
//        int actual = djiin.attack();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public  void testSpeak(){
        Djiin djiin = new Djiin(15,  3);
        String expected = null;
        String actual = djiin.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Djiin djiin = new Djiin(35,  3);
        int expected = 70;
        djiin.setXpDrop();
        int actual = djiin.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void testDrop(){
//        Djiin djiin = new Djiin(40, 3);
//        djiin.drop();
//        int expected = 1;
//
//        Assert.assertEquals(expected, Item.dropTable.size());
//
//    }
}
