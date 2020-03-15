package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Crossbow extends Weapon {
    @JsonCreator
    public Crossbow() {
        super(2);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Crossbow";
    }
}
