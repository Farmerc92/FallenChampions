package npc.monster;

import npc.monster.drops.Item;
import org.junit.Assert;
import org.junit.Test;

public class DrownerTest {
//    @Test
//
//    public void testAttack() {
//        Goblin goblin = new Goblin(15,  3);
//        int damageDone = 2;
//        int expected = damageDone;
//        int actual = goblin.attack();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public  void testSpeak(){
        Drowner drowner = new Drowner(15,  3);
        String expected = null;
        String actual = drowner.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Drowner drowner = new Drowner(76,  3);
        int expected = 152;
        drowner.setXpDrop();
        int actual = drowner.getXpDrop();

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testDrop(){
//        Drowner drowner = new Drowner(40, 3);
//        drowner.drop();
//        int expected = 1;
//
//        Assert.assertEquals(expected, Item.dropTable.size());
//
//    }
}
