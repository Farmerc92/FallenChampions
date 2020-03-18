package player;

import Money.Coin;
import Money.CoinPouch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import player.armors.*;
import player.weapons.*;

import java.util.logging.Logger;

public class InventoryTest {

    private static final Logger LOGGER = Logger.getLogger(InventoryTest.class.getName());

    Inventory inv;

    CoinPouch coinPouch;
    Coin copper;
    Coin silver;
    Coin gold;

    Weapons bow;
    Weapons claymore;
    Weapons deldrimorGreatsword;
    Weapons dsr;
    Weapons longsword;
    Weapons fists;

    Armors chestplate;
    Armors runeplatebody;
    Armors obbyRobes;
    Armors shirt;

    @Before
    public void setup() {
        inv = new Inventory();

        coinPouch = new CoinPouch();
        copper = Coin.COPPER;
        silver = Coin.SILVER;
        gold = Coin.GOLD;

        bow = Weapons.SHORTBOW;
        claymore = Weapons.CLAYMORE;
        longsword = Weapons.LONGSWORD;
        deldrimorGreatsword = Weapons.DELDRIMOREGREATSWORD;
        dsr = Weapons.DHUUMSSOULREAPER;
        fists = Weapons.FISTS;

        chestplate = Armors.CHESTPLATE;
        obbyRobes = Armors.OBSIDIANROBES;
        runeplatebody = Armors.RUNEPLATEBODY;
        shirt = Armors.SHIRT;
    }

    @Test
    public void testInventoryConstructor() {
        Assert.assertEquals(Weapons.FISTS, inv.getCurrentWeapon());
        Assert.assertEquals(Armors.SHIRT, inv.getCurrentArmor());
    }

    @Test
    public void testSetWeapon() {
        inv.addItemToInventory(bow, 5);
        inv.setCurrentWeapon(bow);

        System.out.println(inv.toString());

        Assert.assertEquals(bow, inv.getCurrentWeapon());
        Assert.assertEquals(4, inv.getNumberOfItems(bow));

    }

    @Test
    public void testSetArmor() {
        inv.addItemToInventory(chestplate, 15);
        inv.setCurrentArmor(chestplate);

        System.out.println(inv.toString());

        Assert.assertEquals(chestplate, inv.getCurrentArmor());
        Assert.assertEquals(14, inv.getNumberOfItems(chestplate));
    }

    @Test
    public void testRemoveWeapon() {
        inv.setCurrentWeapon(bow);
        inv.setCurrentWeapon(fists);


        Assert.assertEquals(fists, inv.getCurrentWeapon());
    }

    @Test
    public void testRemoveArmor() {
        inv.setCurrentArmor(chestplate);
        inv.setCurrentArmor(shirt);

        Assert.assertEquals(shirt, inv.getCurrentArmor());
    }

    @Test
    public void testAddItemToInventory() {
        inv.addItemToInventory(runeplatebody, 1);
        inv.addItemToInventory(claymore, 1);

        LOGGER.info("\n" + inv.getSize());

        Managable retrievedItem = inv.getItemFromInventory(runeplatebody);
        Managable retrievedWeapon = inv.getItemFromInventory(claymore);

        Assert.assertEquals(runeplatebody, retrievedItem);
        Assert.assertEquals(claymore, retrievedWeapon);
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
        inv.setCurrentWeapon(deldrimorGreatsword);
        inv.setCurrentArmor(runeplatebody);
        inv.addItemToInventory(runeplatebody, 1);
        inv.addItemToInventory(claymore, 1);
        inv.addItemToInventory(deldrimorGreatsword, 1);
        inv.addItemToInventory(obbyRobes, 2);
        inv.addItemToInventory(dsr, 1);
        inv.addCurrencyToPouch(copper, 20);
        inv.addCurrencyToPouch(silver, 115);
        inv.addCurrencyToPouch(gold, 28);
        inv.fixCurrencyInPouch();

        System.out.println(inv.toString());
    }

}
