package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DeldrimorGreatSword extends Weapon {
    @JsonCreator
    public DeldrimorGreatSword() {
        super(25);
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Deldrimor Greatsword";
    }
}
