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
        Assert.assertTrue(shortsword instanceof Weapon);
        Assert.assertTrue(shortsword instanceof Value);
    }

    @Test
    public void testLongsword() {
        Assert.assertTrue(longsword instanceof Weapon);
        Assert.assertTrue(longsword instanceof Value);
    }

    @Test
    public void testDelDrimoreGreatSword() {
        Assert.assertTrue(deldrimorGreatSword instanceof Weapon);
        Assert.assertTrue(deldrimorGreatSword instanceof Value);
    }

    @Test
    public void testClaymore() {
        Assert.assertTrue(claymore instanceof Weapon);
        Assert.assertTrue(claymore instanceof Value);
    }

    @Test
    public void testCrossbow() {
        Assert.assertTrue(crossbow instanceof Weapon);
        Assert.assertTrue(crossbow instanceof Value);
    }

    @Test
    public void testDhuumsSoulreaper() {
        Assert.assertTrue(dhuumsSoulReaper instanceof Weapon);
        Assert.assertTrue(dhuumsSoulReaper instanceof Value);
    }

    @Test
    public void testMace() {
        Assert.assertTrue(mace instanceof Weapon);
        Assert.assertTrue(mace instanceof Value);
    }

    @Test
    public void testShortbow() {
        Assert.assertTrue(shortbow instanceof Weapon);
        Assert.assertTrue(shortbow instanceof Value);
    }

    @Test
    public void testStaff() {
        Assert.assertTrue(staff instanceof Weapon);
        Assert.assertTrue(staff instanceof Value);
    }

}
