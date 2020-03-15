package npc.monster;

import Money.Coin;
import interfaces.Attack;
import npc.NPC;
import npc.monster.drops.Dropable;

import java.util.Random;

public abstract class Monster extends NPC implements Attack {
    protected int HP;
    protected int Strength;
    protected int Dexterity;
    protected int Intelligence;
    protected int level;
    protected int xpDrop;

    protected Monster(int HP, int strength, int dexterity, int intelligence, int level) {
        this.HP = HP;
        this.level = level;
        Strength = strength;
        Dexterity = dexterity;
        Intelligence = intelligence;
    }

    public int getXpDrop() {
        return xpDrop;
    }

    public void setXpDrop() {
        this.xpDrop = this.HP * 2;
    }

}
