package player;

import org.junit.Assert;
import org.junit.Test;
import player.weapons.*;

public class WeaponsTest {

    Weapon shortsword = new Shortsword();
    Weapon longsword = new Longsword();
    Weapon deldrimorGreatSword = new DeldrimorGreatSword();
    Weapon claymore = new Claymore();
    Weapon crossbow = new Crossbow();
    Weapon dhuumsSoulReaper = new DhuumsSoulReaper();
    Weapon mace = new Mace();
    Weapon shortbow = new Shortbow();
    Weapon staff = new Staff();

    @Test
    public void testShortsword() {
        Assert.assertEquals("Shortsword", shortsword.toString());
        Assert.assertTrue(shortsword instanceof Weapon);
        Assert.assertTrue(shortsword instanceof Value);
    }

    @Test
    public void testLongsword() {
        Assert.assertEquals("Longsword", longsword.toString());
        Assert.assertTrue(longsword instanceof Weapon);
        Assert.assertTrue(longsword instanceof Value);
    }

    @Test
    public void testDelDrimoreGreatSword() {
        Assert.assertEquals("Deldrimor Greatsword", deldrimorGreatSword.toString());
        Assert.assertTrue(deldrimorGreatSword instanceof Weapon);
        Assert.assertTrue(deldrimorGreatSword instanceof Value);
    }

    @Test
    public void testClaymore() {
        Assert.assertEquals("Claymore", claymore.toString());
        Assert.assertTrue(claymore instanceof Weapon);
        Assert.assertTrue(claymore instanceof Value);
    }

    @Test
    public void testCrossbow() {
        Assert.assertEquals("Crossbow", crossbow.toString());
        Assert.assertTrue(crossbow instanceof Weapon);
        Assert.assertTrue(crossbow instanceof Value);
    }

    @Test
    public void testDhuumsSoulreaper() {
        Assert.assertEquals("Dhuum's Soul Reaper", dhuumsSoulReaper.toString());
        Assert.assertTrue(dhuumsSoulReaper instanceof Weapon);
        Assert.assertTrue(dhuumsSoulReaper instanceof Value);
    }

    @Test
    public void testMace() {
        Assert.assertEquals("Mace", mace.toString());
        Assert.assertTrue(mace instanceof Weapon);
        Assert.assertTrue(mace instanceof Value);
    }

    @Test
    public void testShortbow() {
        Assert.assertEquals("Shortbow", shortbow.toString());
        Assert.assertTrue(shortbow instanceof Weapon);
        Assert.assertTrue(shortbow instanceof Value);
    }

    @Test
    public void testStaff() {
        Assert.assertEquals("Staff", staff.toString());
        Assert.assertTrue(staff instanceof Weapon);
        Assert.assertTrue(staff instanceof Value);
    }

}
