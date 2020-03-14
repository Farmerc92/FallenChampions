package locations.areas;

import locations.Location;
import npc.monster.Monster;
import player.Player;

public abstract class Area extends Location {
    protected Monster monster;
    protected Player player;
}
