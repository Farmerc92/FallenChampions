package player;

import Money.CoinPouch;
import player.armors.Armor;
import player.weapons.Weapon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private ArrayList<Weapon> weaponList;
    private ArrayList<Armor> armorList;
    private Map<T, Integer> inventoryItems;
    private CoinPouch coinPouch;

    public Inventory() {
        weaponList = new ArrayList<>();
        armorList = new ArrayList<>();
        coinPouch = new CoinPouch();
        inventoryItems = new HashMap<>(20);
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

    public void addWeaponToWeaponSlot(Weapon weapon) {
        weaponList.add(weapon);
    }

    public void removeWeaponFromWeaponSlot(Weapon weapon) {
        armorList.remove(weapon);
    }

    public void addArmorToArmorSlot(Armor armor) {
        armorList.add(armor);
    }

    public void removeArmorFromArmorSlot(Armor armor) {
        armorList.remove(armor);
    }

    public Map<T, Integer> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(Map<T, Integer> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public void addItemToInventory(T itemToAdd, Integer numberOfItems) {
        inventoryItems.put(itemToAdd, numberOfItems);
    }

    public T getItemFromInventory(T itemToRetrieve) {
        for (Map.Entry<T, Integer> slot : inventoryItems.entrySet()) {
            if (slot.getKey().equals(itemToRetrieve)) {
                inventoryItems.remove(slot.getKey());
                return slot.getKey();
            }
        }
        return null;
    }

    public Integer getSize() {
        return inventoryItems.size();
    }

    @Override
    public String toString() {
        String a = "+-----------------------------+\n";
                a += "|          INVENTORY          |\n";
                a += "+-----------------------------+\n";
                a += "| ITEM                    Qty |\n";
                a += "+-----------------------------+\n";
                String doTheFormat = "| %-20s | %-4d |%n";
                for (Map.Entry<T, Integer> item : inventoryItems.entrySet()) {
                    a += String.format(doTheFormat, item.getKey(), item.getValue());
                }
                a += "+-----------------------------+\n";
        return a;
    }

}

