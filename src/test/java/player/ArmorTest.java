package player;

import interfaces.Value;
import org.junit.Assert;
import org.junit.Test;
import player.armors.*;

public class ArmorTest {

    Armor chainMail = new ChainMail();
    Armor chestPlate = new Chestplate();
    Armor greendhide = new GreenDHide();
    Armor leatherVest = new LeatherVest();
    Armor obsidianRobes = new ObsidianRobes();
    Armor robes = new Robes();
    Armor runePlateBody = new RunePlateBody();
    Armor shirt = new Shirt();



    @Test
    public void testChainMail() {
        Assert.assertEquals("Chain Mail", chainMail.toString());
        Assert.assertTrue(chainMail instanceof Armor);
        Assert.assertTrue(chainMail instanceof Value);
    }

    @Test
    public void testChestPlate() {
        Assert.assertEquals("Chestplate", chestPlate.toString());
        Assert.assertTrue(chestPlate instanceof Armor);
        Assert.assertTrue(chestPlate instanceof Value);
    }

    @Test
    public void testGreenDHide() {
        Assert.assertEquals("Green d'hide", greendhide.toString());
        Assert.assertTrue(greendhide instanceof Armor);
        Assert.assertTrue(greendhide instanceof Value);
    }

    @Test
    public void testLeatherVest() {
        Assert.assertEquals("Leather Vest", leatherVest.toString());
        Assert.assertTrue(leatherVest instanceof Armor);
        Assert.assertTrue(leatherVest instanceof Value);
    }

    @Test
    public void testObsidianRobes() {
        Assert.assertEquals("Obsidian Robes", obsidianRobes.toString());
        Assert.assertTrue(obsidianRobes instanceof Armor);
        Assert.assertTrue(obsidianRobes instanceof Value);
    }

    @Test
    public void testRobes() {
        Assert.assertEquals("Robes", robes.toString());
        Assert.assertTrue(robes instanceof Armor);
        Assert.assertTrue(robes instanceof Value);
    }

    @Test
    public void testRunePlateBody() {
        Assert.assertEquals("Rune Platebody", runePlateBody.toString());
        Assert.assertTrue(runePlateBody instanceof Armor);
        Assert.assertTrue(runePlateBody instanceof Value);
    }

    @Test
    public void testShirt() {
        Assert.assertEquals("Shirt", shirt.toString());
        Assert.assertTrue(shirt instanceof Armor);
        Assert.assertTrue(shirt instanceof Value);
    }

}
