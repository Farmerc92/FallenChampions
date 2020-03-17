package npc.monster.drops;

public class YellowBead extends Item implements Dropable {
    @Override
    public int value() {
        return 25;
    }

    @Override
    public void addToLootTable() {
        String name = "Yellow Bead";
        dropTable.put(name, 1);
    }
}
