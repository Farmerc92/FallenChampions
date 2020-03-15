package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class BasiliskEyeTest {
    @Test
    public void getValueTest(){
        BasiliskEye basiliskEye = new BasiliskEye();
        int expected = 100;

        Assert.assertEquals(basiliskEye.value(), expected);
    }
}
