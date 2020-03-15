package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class CandleTest {
    @Test
    public void getValueTest(){
        Candle candle = new Candle();
        int expected = 8;

        Assert.assertEquals(candle.value(), expected);
    }
}
