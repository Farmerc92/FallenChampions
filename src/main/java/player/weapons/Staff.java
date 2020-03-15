package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Staff extends Weapon {
    @JsonCreator
    public Staff() {
        super(1);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Staff";
    }
}
