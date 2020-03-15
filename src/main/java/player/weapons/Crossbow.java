package player.weapons;

public class Crossbow extends Weapon {

    public Crossbow() {
        super(2);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Crossbow";
    }
}
