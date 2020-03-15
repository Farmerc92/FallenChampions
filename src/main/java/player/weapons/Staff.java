package player.weapons;

public class Staff extends Weapon {

    public Staff() {
        super(1);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Staff";
    }
}
