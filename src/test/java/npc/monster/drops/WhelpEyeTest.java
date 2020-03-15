package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class WhelpEyeTest {
    @Test
    public void getValueTest(){
        WhelpEye whelpEye = new WhelpEye();
        int expected = 156;

        Assert.assertEquals(whelpEye.value(), expected);
    }
}
