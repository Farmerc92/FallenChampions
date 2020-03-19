package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class WhiteBeadTest {
    @Test
    public void getValueTest(){
        WhiteBead whiteBead = new WhiteBead();
        int expected = 25;

        Assert.assertEquals(whiteBead.value(), expected);
    }
}
