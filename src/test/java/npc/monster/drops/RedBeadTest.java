package npc.monster.drops;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Assert;
import org.junit.Test;

public class RedBeadTest {
    @Test
    public void getValueTest(){
        RedBead redBead = new RedBead();
        int expected = 25;

        Assert.assertEquals(redBead.value(), expected);
    }
}
