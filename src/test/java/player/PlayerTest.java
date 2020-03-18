package player;

import locations.Location;
import locations.areas.ElwynnForest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.armors.Armors;
import player.weapons.Weapons;

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
        Assert.assertEquals(Weapons.FISTS, player.getWeapon());
        Assert.assertEquals(Armors.SHIRT, player.getArmor());
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

    @Test
    public void getCurrentHpTest(){
        int expected = player.getCurrentHp();
        int actual = 10;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentMpTest(){
        int expected = player.getCurrentMp();
        int actual = 10;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void useManaTest(){
        int cost = 5;
        int actual = 5;
        player.useMana(cost);
        int expected = player.getCurrentMp();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void restoreMpTest(){
        int cost = 5;
        int actualBefore = player.getHp() - cost;
        player.useMana(cost);
        int expectedBefore = player.getCurrentMp();
        player.restoreMp();
        int actualAfter = 10;
        int expectedAfter = player.getCurrentMp();
        Assert.assertEquals(actualBefore, expectedBefore);
        Assert.assertEquals(actualAfter, expectedAfter);
    }

    @Test
    public void restoreHpTest(){
        int damage = 5;
        int actualBefore = player.getHp() - damage;
        player.takeDamage(damage);
        int expectedBefore = player.getCurrentHp();
        player.restoreHp();
        int actualAfter = 10;
        int expectedAfter = player.getCurrentHp();
        Assert.assertEquals(actualBefore, expectedBefore);
        Assert.assertEquals(actualAfter, expectedAfter);
    }

    @Test
    public void takeDamageTest(){
        int damage = 5;
        int actual = player.getHp() - damage;
        player.takeDamage(damage);
        int expected = player.getCurrentHp();
        Assert.assertEquals(actual, expected);
    }

}
