package player.armors;

public class Chestplate extends Armor{

    public Chestplate() {
        super(2);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Chestplate";
    }
}
