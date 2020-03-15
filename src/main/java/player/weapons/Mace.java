package player.weapons;

public class Mace extends Weapon {

    public Mace() {
        super(4);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mace";
    }
}
