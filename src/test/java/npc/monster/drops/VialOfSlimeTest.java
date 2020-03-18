package npc.monster.drops;

import npc.monster.Slime;
import org.junit.Assert;
import org.junit.Test;

public class VialOfSlimeTest {
    @Test
    public void getValueTest(){
        VialOfSlime vialOfSlime = new VialOfSlime();
        int expected = 5;

        Assert.assertEquals(vialOfSlime.value(), expected);
    }
}
