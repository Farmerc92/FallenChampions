package player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.armors.Armor;
import player.armors.Chestplate;
import player.weapons.Longsword;
import player.weapons.Weapon;

public class InventoryTest {

    Inventory inv;
    Weapon weapon;
    Armor armor;

    @Before
    public void setup() {
        inv = new Inventory();
        weapon = new Longsword();
        armor = new Chestplate();
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
        inv.addWeapon(weapon);
        int weaponSize = inv.getWeaponList().size();
        Assert.assertEquals(1, weaponSize);
    }

    @Test
    public void testAddArmor() {
        inv.addArmor(armor);
        int armorSize = inv.getArmorList().size();
        Assert.assertEquals(1, armorSize);
    }

    @Test
    public void testRemoveWeapon() {
        inv.addWeapon(weapon);
        inv.removeWeapon(weapon);
        int weaponSize = inv.getWeaponList().size();
        Assert.assertEquals(1, weaponSize);
    }

    @Test
    public void testRemoveArmor() {
        inv.addArmor(armor);
        inv.removeArmor(armor);
        int armorSize = inv.getArmorList().size();
        Assert.assertEquals(1, armorSize);
    }

}
