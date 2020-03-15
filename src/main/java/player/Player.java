package player;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.Attack;
import locations.Location;
import player.armors.Armor;
import player.armors.Chestplate;
import player.skills.Skills;
import player.weapons.DhuumsSoulReaper;
import player.weapons.Shortsword;
import player.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player implements Attack {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int hp;
    private int currentHp;
    private int mp;
    private int currentMp;
    private int level;
    private int experience;
    private Inventory inventory;
    private Armor armor;
    private Weapon weapon;
    private List<Skills> skills;
    private String name;
    private Location location;

    public Player(String name){
        strength = 5;
        dexterity = 5;
        intelligence = 5;
        hp = 10;
        currentHp = 10;
        mp = 10;
        currentMp = 10;
        level = 1;
        experience = 0;
        inventory = new Inventory();
        armor = new Chestplate();
        weapon = new Shortsword();
        skills = new ArrayList<>();
        this.name = name;
        location = null;
    }

    // God player for testing purposes
    public Player(int a){
        dexterity = 50000;
        intelligence = 50000;
        strength = 50000;
        hp = 100000;
        currentHp = 10000;
        mp = 100000;
        currentMp = 10000;
        level  = 99;
        experience = 0;
        inventory = new Inventory();
        armor = new Chestplate();
        weapon = new DhuumsSoulReaper();
        skills = new ArrayList<>();
        this.name = "God";
        location = null;
    }
    @JsonCreator
    public Player(@JsonProperty("strength") int strength, @JsonProperty("dexterity") int dexterity,
                  @JsonProperty("intelligence") int intelligence, @JsonProperty("hp") int hp,
                  @JsonProperty("currentHp") int currentHp, @JsonProperty("mp") int mp,
                  @JsonProperty("currentMp") int currentMp, @JsonProperty("level") int level,
                  @JsonProperty("experience") int experience, @JsonProperty("inventory") Inventory inventory,
                  @JsonProperty("armor") Armor armor, @JsonProperty("weapon") Weapon weapon,
                  @JsonProperty("skills") ArrayList<Skills> skills, @JsonProperty("name") String name,
                  @JsonProperty("location") Location location){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.hp = hp;
        this.currentHp = currentHp;
        this.mp = mp;
        this.currentMp = currentMp;
        this.level = level;
        this.experience = experience;
        this.inventory = inventory;
        this.armor = armor;
        this.weapon = weapon;
        this.skills = skills;
        this.name = name;
        this.location = location;
    }

    public int getStrength() {
        return strength;
    }

    public void incrementStrength() {
        this.strength++;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void incrementDexterity() {
        this.dexterity++;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void incrementIntelligence() {
        this.intelligence++;
    }

    public int getHp() {
        return hp;
    }

    public void incrementHp() {
        this.hp += 5;
    }

    public int getCurrentHp() { return currentHp; }

    public void restoreHp() { this.currentHp = hp; }

    public void takeDamage(int damage) { currentHp -= damage; }

    public int getMp() { return mp; }

    public void incrementMp() {
        this.mp += 5;
    }

    public int getCurrentMp() { return currentMp; }

    public void restoreMp() { currentMp = mp; }

    public void useMana(int cost) { currentMp -= cost; }

    public Inventory getInventory() {
        return inventory;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() { return name; }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int attack() {
        return weapon.getAttackPower() + strength;
    }
}
