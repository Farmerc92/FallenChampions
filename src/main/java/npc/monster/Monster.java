package npc.monster;

import interfaces.Attack;
import npc.NPC;

public abstract class Monster extends NPC implements Attack {
    protected int HP;
    protected int Strength;
    protected int Dexterity;
    protected int Intelligence;
    protected int level;

    public Monster(int HP, int strength, int dexterity, int intelligence, int level) {
        this.HP = HP;
        this.level = level;
        Strength = strength;
        Dexterity = dexterity;
        Intelligence = intelligence;
    }
    public Integer xpDrop(){
     return null;
    }
}
