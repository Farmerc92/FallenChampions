package player.weapons;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DhuumsSoulReaper extends Weapon {
    @JsonCreator
    public DhuumsSoulReaper(){
        super(500);
    }

    public int value() {
        return 0;
    }

    @Override
    public String toString() {
        return "Dhuum's Soul Reaper";
    }
}
