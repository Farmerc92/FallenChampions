package player;

import player.armors.Armor;
import player.weapons.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private ArrayList<Weapon> weapon;
    private ArrayList<Armor> armor;
    private Map<T, Integer> inventoryItems;

    public Inventory() {
        weapon = new ArrayList<>();
        armor = new ArrayList<>();
        inventoryItems = new HashMap<>();
    }

    public ArrayList<Weapon> getWeapon() {
        return weapon;
    }

    public void setWeapon(ArrayList<Weapon> weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Armor> getArmor() {
        return armor;
    }

    public void setArmor(ArrayList<Armor> armor) {
        this.armor = armor;
    }

    public Map<T, Integer> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(Map<T, Integer> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

}
