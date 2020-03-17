package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Shortsword extends Weapon {
    @JsonCreator
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
