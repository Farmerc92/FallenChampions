package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Longsword extends Weapon {
    @JsonCreator
    public Longsword() {
        super(3);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Longsword";
    }
}
