package player;

import org.junit.Assert;
import org.junit.Test;
import player.armors.*;

public class ArmorTest {

    Armors chainMail = Armors.CHAINMAIL;
    Armors chestPlate = Armors.CHESTPLATE;
    Armors greendhide = Armors.GREENDHIDE;
    Armors leatherVest = Armors.LEATHERVEST;
    Armors obsidianRobes = Armors.OBSIDIANROBES;
    Armors robes = Armors.ROBES;
    Armors runePlateBody = Armors.RUNEPLATEBODY;
    Armors shirt = Armors.SHIRT;



    @Test
    public void testChainMail() {
        Assert.assertEquals("Chainmail", chainMail.getName());
        Assert.assertEquals(3, chainMail.getDefensePower());
    }

    @Test
    public void testChestPlate() {
        Assert.assertEquals("Chestplate", chestPlate.getName());
        Assert.assertEquals(5, chestPlate.getDefensePower());
    }

    @Test
    public void testGreenDHide() {
        Assert.assertEquals("Green d'hide", greendhide.getName());
        Assert.assertEquals(24, greendhide.getDefensePower());
    }

    @Test
    public void testLeatherVest() {
        Assert.assertEquals("Leather Vest", leatherVest.getName());
        Assert.assertEquals(3, leatherVest.getDefensePower());
    }

    @Test
    public void testObsidianRobes() {
        Assert.assertEquals("Obsidian Robes", obsidianRobes.getName());
        Assert.assertEquals(50, obsidianRobes.getDefensePower());
    }

    @Test
    public void testRobes() {
        Assert.assertEquals("Robes", robes.getName());
        Assert.assertEquals(4, robes.getDefensePower());
    }

    @Test
    public void testRunePlateBody() {
        Assert.assertEquals("Rune Platebody", runePlateBody.getName());
        Assert.assertEquals(55, runePlateBody.getDefensePower());
    }

    @Test
    public void testShirt() {
        Assert.assertEquals("Shirt", shirt.getName());
        Assert.assertEquals(1, shirt.getDefensePower());
    }

}
