package player;

import player.armors.Armor;
import player.weapons.Weapon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private ArrayList<Weapon> weaponList;
    private ArrayList<Armor> armorList;
    private Map<T, Integer> inventoryItems;

    public Inventory() {
        weaponList = new ArrayList<>();
        armorList = new ArrayList<>();
        inventoryItems = new HashMap<>();
    }

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public ArrayList<Armor> getArmorList() {
        return armorList;
    }

    public void setArmorList(ArrayList<Armor> armorList) {
        this.armorList = armorList;
    }

    public void addWeapon(Weapon weapon) {
        weaponList.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        armorList.remove(weapon);
    }

    public void addArmor(Armor armor) {
        armorList.add(armor);
    }

    public void removeArmor(Armor armor) {
        armorList.remove(armor);
    }

    public Map<T, Integer> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(Map<T, Integer> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

}
