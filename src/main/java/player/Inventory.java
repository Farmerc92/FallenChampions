package player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private ArrayList<T> gear;
    private Map<T, T> inventoryItems;
    private int hp;
    private int mp;
    private int level;
    private int exp;
    private int strength;
    private int dexterity;
    private int intelligence;

    Player player = new Player();

    public Inventory() {
        gear = new ArrayList<>();
        inventoryItems = new HashMap<>();
        hp = player.getHp();
        mp = player.getMp();
        exp = player.getExperience();
        level = player.getLevel();
        strength = player.getStrength();
        dexterity = player.getDexterity();
        intelligence = player.getIntelligence();
    }

}
