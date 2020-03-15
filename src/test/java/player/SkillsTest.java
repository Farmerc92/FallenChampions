package player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.skills.Fireball;

public class SkillsTest {

    Fireball skill;

    @Before
    public void setup() {
        skill = new Fireball();
    }

    @Test
    public void testSkillsFireballConstructor() {
        Assert.assertEquals(5, skill.getDamage());
    }

    @Test
    public void testGetOutputFromFireball() {
        String actualResult = skill.cast();
        String expectedResult = "You cast Fireball!";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
