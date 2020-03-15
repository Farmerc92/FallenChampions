package Money;


import npc.monster.drops.Dropable;

public enum Coin implements Dropable {
    GOLD(1),
    SILVER(1),
    COPPER(1);

    int value;

    Coin (int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
