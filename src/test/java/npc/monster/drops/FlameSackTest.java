package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class FlameSackTest {
    @Test
    public void getValueTest(){
        FlameSack flameSack = new FlameSack();
        int expected = 376;

        Assert.assertEquals(flameSack.value(), expected);
    }
}
