package player.armors;

public class ObsidianRobes extends Armor{

    public ObsidianRobes() {
        super(60);
    }

    @Override
    public int value() {
        return 500;
    }

    @Override
    public String toString() {
        return "Obsidian Robes";
    }
}
