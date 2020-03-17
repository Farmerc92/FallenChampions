package npc.monster.drops;

public class BlackBead extends Item implements Dropable {
    @Override
    public int value() {
        return 25;
    }

    @Override
    public void addToLootTable() {
        String name = "Black Bead";
        dropTable.put(name, 1);
    }
}
