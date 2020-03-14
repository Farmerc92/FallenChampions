package player.armors;

import player.Value;

public abstract class Armor implements Value {
    protected int defenseRating;

    public Armor(int defenseRating) {
        this.defenseRating = defenseRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }
}
