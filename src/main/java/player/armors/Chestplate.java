package player.armors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Chestplate extends Armor{

    public Chestplate() {
        super(2);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Chestplate";
    }
}
