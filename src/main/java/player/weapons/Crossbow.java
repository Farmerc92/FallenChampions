package player.weapons;

public class Crossbow extends Weapon {

    public Crossbow() {
        attackPower = 2;
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Crossbow";
    }
}
