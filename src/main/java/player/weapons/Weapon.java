package player.weapons;

import interfaces.Value;

public abstract class Weapon implements Value {
    protected int attackPower;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
