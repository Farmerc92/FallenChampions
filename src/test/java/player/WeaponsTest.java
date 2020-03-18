package player;

import org.junit.Assert;
import org.junit.Test;
import player.weapons.*;

public class WeaponsTest {

    Weapons shortsword = Weapons.SHORTSWORD;
    Weapons longsword = Weapons.LONGSWORD;
    Weapons deldrimorGreatSword = Weapons.DELDRIMOREGREATSWORD;
    Weapons claymore = Weapons.CLAYMORE;
    Weapons crossbow = Weapons.CROSSBOW;
    Weapons dhuumsSoulReaper = Weapons.DHUUMSSOULREAPER;
    Weapons mace = Weapons.MACE;
    Weapons shortbow = Weapons.SHORTBOW;
    Weapons staff = Weapons.STAFF;
    Weapons fists = Weapons.FISTS;

    @Test
    public void testShortsword() {
        Assert.assertEquals("Shortsword", shortsword.getName());
        Assert.assertEquals(2, shortsword.getAttackPower());
    }

    @Test
    public void testLongsword() {
        Assert.assertEquals("Longsword", longsword.getName());
        Assert.assertEquals(2, longsword.getAttackPower());
    }

    @Test
    public void testDelDrimoreGreatSword() {
        Assert.assertEquals("Deldrimor Greatsword", deldrimorGreatSword.getName());
        Assert.assertEquals(25, deldrimorGreatSword.getAttackPower());
    }

    @Test
    public void testClaymore() {
        Assert.assertEquals("Claymore", claymore.getName());
        Assert.assertEquals(2, claymore.getAttackPower());
    }

    @Test
    public void testCrossbow() {
        Assert.assertEquals("Crossbow", crossbow.getName());
        Assert.assertEquals(1, crossbow.getAttackPower());
    }

    @Test
    public void testDhuumsSoulreaper() {
        Assert.assertEquals("Dhuum's Soul Reaper", dhuumsSoulReaper.getName());
        Assert.assertEquals(2, dhuumsSoulReaper.getAttackPower());
    }

    @Test
    public void testMace() {
        Assert.assertEquals("Mace", mace.getName());
        Assert.assertEquals(2, mace.getAttackPower());
    }

    @Test
    public void testShortbow() {
        Assert.assertEquals("Shortbow", shortbow.getName());
        Assert.assertEquals(2, shortbow.getAttackPower());
    }

    @Test
    public void testStaff() {
        Assert.assertEquals("Staff", staff.getName());
        Assert.assertEquals(2, staff.getAttackPower());
    }

    @Test
    public void testFists() {
        Assert.assertEquals("Fists", fists.getName());
        Assert.assertEquals(1, fists.getAttackPower());
    }

}
