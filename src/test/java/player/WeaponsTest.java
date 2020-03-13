package player;

import org.junit.Assert;
import org.junit.Test;
import player.weapons.DeldrimorGreatSword;
import player.weapons.Shortsword;
import player.weapons.Weapon;

public class WeaponsTest {

    Weapon shortsword = new Shortsword();
    Weapon deldrimorGreatSword = new DeldrimorGreatSword();

    @Test
    public void testShortsword() {
        Assert.assertTrue(shortsword instanceof Weapon);
        Assert.assertTrue(shortsword instanceof Value);
    }

    @Test
    public void testDelDrimoreGreatSword() {
        Assert.assertTrue(deldrimorGreatSword instanceof Weapon);
        Assert.assertTrue(deldrimorGreatSword instanceof Value);
    }
}
