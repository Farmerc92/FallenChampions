package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Shortbow extends Weapon{
    @JsonCreator
    public Shortbow() {
        super(1);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shortbow";
    }
}
