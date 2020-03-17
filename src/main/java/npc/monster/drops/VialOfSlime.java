package npc.monster.drops;

public class VialOfSlime extends Item {
    @Override
    public int value() {
        return 5;
    }

    @Override
    public void addToLootTable() {
        String vialOfSlime = "Vial of Slime";
        dropTable.put(vialOfSlime,1);
    }
}
