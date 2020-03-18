package npc.monster;

import npc.monster.drops.Item;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class SlimeTest {
//    @Test
//
//    public void testAttack() {
//        Slime slime = new Slime(15,  3);
//        int damageDone = 2;
//        int expected = damageDone;
//        int actual = slime.attack();
//
//        Assert.assertEquals(expected, actual);
//    }

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

    @Test
    public void testDrop(){
        Slime slime = new Slime(8, 3);
        slime.drop();
        int expected = 1;

        Assert.assertEquals(expected, Item.dropTable.size());

    }
}
