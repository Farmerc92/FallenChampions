package player;

import Money.Coin;
import Money.CoinPouch;
import player.armors.Armors;
import player.weapons.Weapons;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Weapons currentWeapon;
    private Armors currentArmor;
    private Map<player.Managable, Integer> inventoryItems;
    private CoinPouch coinPouch;

    public Inventory() {
        currentWeapon = Weapons.FISTS;
        currentArmor = Armors.SHIRT;
        coinPouch = new CoinPouch();
        inventoryItems = new HashMap<>(20);
    }

    public void addCurrencyToPouch(Coin coinType, int amountOfCoin) {
        this.coinPouch.addCurrency(coinType, amountOfCoin);
    }

    public void fixCurrencyInPouch() {
        this.coinPouch.fixCoin();
    }

    public Weapons getWeaponList() {
        return currentWeapon;
    }

    public Weapons getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapons weaponToEquip) {
        if (inventoryItems.containsKey(weaponToEquip)) {
            getItemFromInventory(weaponToEquip);
            currentWeapon = weaponToEquip;
            System.out.println("You have equipped a " + weaponToEquip.getName());
        } else
            System.out.println("You do not have this item in your inventory");
    }

    public Armors getCurrentArmor() {
        return currentArmor;
    }

    public int getNumberOfItems (Managable item) {
        for (Map.Entry<Managable, Integer> element : inventoryItems.entrySet()) {
            if (inventoryItems.containsKey(item)) {
                return element.getValue();
            }
        }
        return 0;
    }

    public void setCurrentArmor(Armors armorToEquip) {
        if (inventoryItems.containsKey(armorToEquip)) {
            getItemFromInventory(armorToEquip);
            currentArmor = armorToEquip;
            System.out.println("You have equipped " + armorToEquip.getName());
        } else {
            System.out.println("You do not own this armor.");
        }
    }

    public Map<player.Managable, Integer> getInventoryItems() {
        return inventoryItems;
    }

    public void addItemToInventory(Managable itemToAdd, Integer numberOfItems) {
        inventoryItems.put(itemToAdd, numberOfItems);
    }

    public Managable getItemFromInventory(Managable itemToRetrieve) {
        for (Map.Entry<Managable, Integer> slot : inventoryItems.entrySet()) {
            if (slot.getKey().equals(itemToRetrieve)) {
                if (slot.getValue() > 1) {
                    slot.setValue(slot.getValue() - 1);
                    return slot.getKey();
                } else if (slot.getValue() == 1) {
                    inventoryItems.remove(slot.getKey());
                    return slot.getKey();
                }
            }
        }
        return null;
    }

    public Integer getSize() {
        return inventoryItems.size();
    }

    @Override
    public String toString() {
        String doTheFormat = "| GOLD: %-4d SILVER: %-2d  COPPER: %-2d        |\n";
        String doItAgainForAtk = "| %-23s | Atk: %-3d | %-3d |%n";
        String doItAgainForDef = "| %-23s | Def: %-3d | %-3d |%n";
        String doItAgainForItems = "| %-23s | %-3d | %-3d |%n";
        String youGonnaDoIt = "| wpn: %-36s|\n";
        String actuallyDoIt = "| armor: %-32s  |\n";

        String a = "+------------------------------------------+\n";
                a += "|                  INVENTORY               |\n";
                a += "+------------------------------------------+\n";
                a += String.format(youGonnaDoIt, getCurrentWeapon());
                a += String.format(actuallyDoIt, getCurrentArmor());
                a += "+------------------------------------------+\n";
                a += String.format(doTheFormat, this.coinPouch.getGold(), this.coinPouch.getSilver(), this.coinPouch.getCopper());
                a += "+------------------------------------------+\n";
                a += "| ITEM                                 Qty |\n";
                a += "+------------------------------------------+\n";

                for (Map.Entry<Managable, Integer> item : inventoryItems.entrySet()) {
                    if (item.getKey() instanceof Weapons) {
                        a += String.format(doItAgainForAtk, item.getKey(), ((Weapons) item.getKey()).getAttackPower(), item.getValue());
                    } else if (item.getKey() instanceof Armors) {
                        a += String.format(doItAgainForDef, item.getKey(), ((Armors) item.getKey()).getDefensePower(), item.getValue());
                    } else
                        a += String.format(doItAgainForDef, item.getKey(), item.getValue());
                }
                a += "+------------------------------------------+\n";
        return a;
    }

}

