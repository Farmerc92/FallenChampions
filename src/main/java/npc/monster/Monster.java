package npc.monster;

import Money.Coin;
import interfaces.Attack;
import npc.NPC;
import npc.monster.drops.Dropable;

import java.util.Random;

public abstract class Monster extends NPC implements Attack {
    protected int HP;
    protected int currentHP;
    protected int level;
    protected int xpDrop;
    protected String name;

    protected Monster(int HP, int level) {
        this.HP = HP;
        this.currentHP = HP;
        this.level = level;
    }

    public int getXpDrop() {
        return xpDrop;
    }

    public void setXpDrop() {
        this.xpDrop = this.HP * 2;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void damageHP(int damage) {
        this.currentHP -= damage;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
