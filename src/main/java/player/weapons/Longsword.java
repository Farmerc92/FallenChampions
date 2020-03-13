package player.weapons;

public class Longsword extends Weapon {

    public Longsword() {
        attackPower = 3;
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Longsword";
    }
}
