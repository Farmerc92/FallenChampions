package player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.armors.Armor;
import player.armors.Chestplate;
import player.armors.ObsidianRobes;
import player.armors.RunePlateBody;
import player.weapons.*;

import java.util.logging.Logger;

public class InventoryTest {

    private static final Logger LOGGER = Logger.getLogger(InventoryTest.class.getName());


    Inventory<Object> inv;

    Weapon weapon;
    Weapon claymore;
    Weapon deldrimorGreatsword;
    Weapon dsr;

    Armor armor;
    Armor runeplatebody;
    Armor obbyRobes;

    @Before
    public void setup() {
        inv = new Inventory<>();

        weapon = new Longsword();
        claymore = new Claymore();
        deldrimorGreatsword = new DeldrimorGreatSword();
        dsr = new DhuumsSoulReaper();

        armor = new Chestplate();
        obbyRobes = new ObsidianRobes();
        runeplatebody = new RunePlateBody();


    }

    @Test
    public void testInventoryConstructor() {
        int armorSize = inv.getArmorList().size();
        int weaponSize = inv.getWeaponList().size();

        Assert.assertEquals(0,armorSize);
        Assert.assertEquals(0,weaponSize);
    }

    @Test
    public void testAddWeapon() {
        inv.addWeaponToWeaponSlot(weapon);
        int weaponSize = inv.getWeaponList().size();

        Assert.assertEquals(1, weaponSize);
    }

    @Test
    public void testAddArmor() {
        inv.addArmorToArmorSlot(armor);
        int armorSize = inv.getArmorList().size();

        Assert.assertEquals(1, armorSize);
    }

    @Test
    public void testRemoveWeapon() {
        inv.addWeaponToWeaponSlot(weapon);
        inv.removeWeaponFromWeaponSlot(weapon);
        int weaponSize = inv.getWeaponList().size();

        Assert.assertEquals(1, weaponSize);
    }

    @Test
    public void testRemoveArmor() {
        inv.addArmorToArmorSlot(armor);
        inv.removeArmorFromArmorSlot(armor);
        int armorSize = inv.getArmorList().size();

        Assert.assertEquals(0, armorSize);
    }

    @Test
    public void testAddItemToInventory() {
        inv.addItemToInventory(runeplatebody, 1);
        inv.addItemToInventory(claymore, 1);

        LOGGER.info("\n" + inv.getSize());

        String retrievedItem = inv.getItemFromInventory(runeplatebody).toString();
        String expected = "Rune Platebody";
        Assert.assertEquals(expected, retrievedItem);
    }

    @Test
    public void testRemoveItemFromInventory() {
        inv.addItemToInventory(runeplatebody, 1);
        inv.addItemToInventory(claymore, 1);
        inv.getItemFromInventory(runeplatebody);

        int expectedSize = 1;
        int actualSize = inv.getSize();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void printInventory() {
        inv.addItemToInventory(runeplatebody, 1);
        inv.addItemToInventory(claymore, 1);
        inv.addItemToInventory(deldrimorGreatsword, 1);
        inv.addItemToInventory(obbyRobes, 2);
        inv.addItemToInventory(dsr, 1);

        System.out.println(inv.toString());
    }

}
