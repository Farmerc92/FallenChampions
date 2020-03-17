package player.armors;

public class LeatherVest extends Armor {

    public LeatherVest() {
        super(2);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Leather Vest";
    }
}
