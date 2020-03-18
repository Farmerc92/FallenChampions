package npc.monster.drops;

public class WhelpEye extends Item {
    @Override
    public int value() {
        return 156;
    }

    @Override
    public void addToLootTable() {
        String whelpEye = "Whelp Eye";
        dropTable.put(whelpEye,1);
    }
}
