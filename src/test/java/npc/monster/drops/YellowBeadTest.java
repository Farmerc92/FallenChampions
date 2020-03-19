package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class YellowBeadTest {
    @Test
    public void getValueTest(){
        YellowBead yellowBead = new YellowBead();
        int expected = 25;

        Assert.assertEquals(yellowBead.value(), expected);
    }
}
