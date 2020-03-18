package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class BasiliskScaleTest {
    @Test
    public void getValueTest(){
        BasiliskScale basiliskScale = new BasiliskScale();
        int expected = 132;

        Assert.assertEquals(basiliskScale.value(), expected);
    }
}
