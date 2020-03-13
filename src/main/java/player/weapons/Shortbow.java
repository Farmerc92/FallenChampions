package player.weapons;

public class Shortbow extends Weapon{

    public Shortbow() {
        attackPower = 1;
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shortbow";
    }
}
