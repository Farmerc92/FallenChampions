package npc.monster.drops;

import org.junit.Assert;
import org.junit.Test;

public class BlackBeadTest {
    @Test
    public void getValueTest(){
        BlackBead blackBead = new BlackBead();
        int expected = 25;

        Assert.assertEquals(blackBead.value(), expected);
    }
}
