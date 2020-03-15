package player.weapons;

public class Shortsword extends Weapon {

    public Shortsword() {
        super(2);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shortsword";
    }
}
