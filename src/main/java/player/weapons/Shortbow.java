package player.weapons;

public class Shortbow extends Weapon{

    public Shortbow() {
        super(1);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shortbow";
    }
}
