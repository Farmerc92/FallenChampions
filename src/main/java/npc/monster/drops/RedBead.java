package npc.monster.drops;

public class RedBead extends Item implements Dropable {
    @Override
    public int value() {
        return 25;
    }

    @Override
    public void addToLootTable() {
        String name = "Red Bead";
        dropTable.put(name, 1);
    }
}
