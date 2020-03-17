package npc.monster.drops;

public class WhiteBead extends Item implements Dropable {
    @Override
    public int value() {
        return 25;
    }

    @Override
    public void addToLootTable() {
        String name = "White Bead";
        dropTable.put(name, 1);
    }
}
