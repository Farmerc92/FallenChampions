package player;

import locations.Location;
import locations.areas.ElwynnForest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    Player player;

    @Before
    public void setup() {
        player = new Player("");
    }

    @Test
    public void testPlayerConstructor() {
        Assert.assertEquals(5, player.getStrength());
        Assert.assertEquals(5, player.getDexterity());
        Assert.assertEquals(5, player.getIntelligence());
        Assert.assertEquals(10, player.getHp());
        Assert.assertEquals(10, player.getMp());
        Assert.assertEquals(0, player.getInventory().getArmorList().size());
        Assert.assertEquals(0, player.getInventory().getWeaponList().size());
        Assert.assertEquals(1, player.getLevel());
        Assert.assertEquals(0, player.getExperience());
    }

    @Test
    public void testIncrementStrength() {
        player.incrementStrength();
        int newStrength = player.getStrength();
        Assert.assertEquals(6, newStrength);
    }

    @Test
    public void testIncrementIntelligence() {
        player.incrementIntelligence();
        player.incrementIntelligence();
        int newIntelligence = player.getIntelligence();
        Assert.assertEquals(7, newIntelligence);
    }

    @Test
    public void testIncrementDexterity() {
        player.incrementDexterity();
        player.incrementDexterity();
        player.incrementDexterity();
        int newDexterity = player.getDexterity();
        Assert.assertEquals(8, newDexterity);
    }

    @Test
    public void testIncrementHP() {
        player.incrementHp();
        int newHp = player.getHp();
        Assert.assertEquals(15, newHp);
    }

    @Test
    public void testIncrementMp() {
        player.incrementMp();
        int newMp = player.getMp();
        Assert.assertEquals(15, newMp);
    }

    @Test
    public void testGetSkills() {
        int actualSkills = player.getSkills().size();
        Assert.assertEquals(0, actualSkills);

    }

    @Test
    public void testSetExperience() {
        player.setExperience(10000);
        Assert.assertEquals(10000, player.getExperience());
    }

    @Test
    public void testSetLevel() {
        player.setLevel(60);
        Assert.assertEquals(60, player.getLevel());
    }

    @Test
    public void testSetSkills() {

    }

    @Test
    public void getNameTest(){
        String expected = "";
        String actual = player.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLocationTest(){
        Location actual = player.getLocation();
        Assert.assertNull(actual);
    }

    @Test
    public void setLocationTest(){
        Location expected = new ElwynnForest();
        player.setLocation(expected);
        Assert.assertEquals(expected, player.getLocation());
    }

}
