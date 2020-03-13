package player.weapons;

import player.Value;

public abstract class Weapon implements Value {
    protected int attackPower;

    public void Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
