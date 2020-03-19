package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class VialOfWaterTest {
    @Test
    public void getValueTest(){
        VialOfWater vialOfWater = new VialOfWater();
        int expected = 1;

        Assert.assertEquals(vialOfWater.value(), expected);
    }
}
