package player.weapons;

public class Claymore extends Weapon {

    public Claymore() {
        super(5);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Claymore";
    }
}
