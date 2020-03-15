package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Mace extends Weapon {
    @JsonCreator
    public Mace() {
        super(4);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mace";
    }
}
