package npc.monster;

import org.junit.Assert;
import org.junit.Test;

public class GoblinTest {
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
        Goblin goblin = new Goblin(15,  3);
        String expected = "My precious!";
        String actual = goblin.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXpDrop() {
        Goblin goblin = new Goblin(8,  3);
        int expected = 16;
        goblin.setXpDrop();
        int actual = goblin.getXpDrop();

        Assert.assertEquals(expected, actual);
    }
}
