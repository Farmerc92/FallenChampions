package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class AppleTest {
    @Test
    public void getValueTest(){
        Apple apple = new Apple();
        int expected = 3;

        Assert.assertEquals(apple.value(), expected);
    }
}
