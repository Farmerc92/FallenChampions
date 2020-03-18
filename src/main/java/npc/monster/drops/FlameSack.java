package npc.monster.drops;

public class FlameSack extends Item {
    @Override
    public int value() {
        return 376;
    }

    @Override
    public void addToLootTable() {
        String flameSack = "Flame Sack";
        dropTable.put(flameSack,1);
    }
}
