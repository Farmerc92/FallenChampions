package player;

import interfaces.Attack;
import locations.Location;
import player.armors.Armor;
import player.skills.Skills;
import player.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player implements Attack {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int hp;
    private int mp;
    private int level;
    private int experience;
    private Inventory inventory;
    private Armor armor;
    private Weapon weapon;
    private List<Skills> skills;
    private String name;
    private Location location;

    public Player(String name){
        this.name = name;
        strength = 5;
        dexterity = 5;
        intelligence = 5;
        hp = 10;
        mp = 10;
        skills = new ArrayList<>();
        inventory = new Inventory();
        level = 1;
        experience = 0;
        location = null;
    }

    // God player for testing purposes
    public Player(int a){
        dexterity = 50000;
        intelligence = 50000;
        strength = 50000;
        hp = 100000;
        mp = 100000;
        level  = 99;
    }

    public Player(String name, int strength, int dexterity, int intelligence, int hp, int mp, ArrayList<Skills> skills,
                  Inventory inventory, int level, int experience, Location location){
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.hp = hp;
        this.mp = mp;
        this.skills = skills;
        this.inventory = inventory;
        this.level = level;
        this.experience = experience;
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

    public int getMp() {
        return mp;
    }

    public void incrementMp() {
        this.mp += 5;
    }

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

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
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

    public String getName() {
        return name;
    }

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
