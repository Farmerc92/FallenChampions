package npc.monster.drops;

public class VialOfWater extends Item implements Dropable {
    @Override
    public int value() {
        return 1;
    }

    @Override
    public void addToLootTable() {
        String name = "Vial of Water";
        dropTable.put(name, 1);

    }
}
