package player.weapons;

public class Mace extends Weapon {

    public Mace() {
        attackPower = 4;
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mace";
    }
}
