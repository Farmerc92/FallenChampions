package player.armors;

public class Shirt extends Armor {

    public Shirt() {
        super(1);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shirt";
    }
}
