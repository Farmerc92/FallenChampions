package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class WhelpScaleTest {

    @Test
    public void getValueTest(){
        WhelpScale whelpScale = new WhelpScale();
        int expected = 300;

        Assert.assertEquals(whelpScale.value(), expected);
    }
}
