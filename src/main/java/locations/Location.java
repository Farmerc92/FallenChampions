package locations;

import player.Player;

public abstract class Location {
    protected Player player = null;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
