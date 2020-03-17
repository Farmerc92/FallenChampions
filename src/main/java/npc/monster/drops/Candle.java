package npc.monster.drops;

public class Candle extends Item implements Dropable {
    @Override
    public int value() {
        return 8;
    }

    @Override
    public void addToLootTable() {
        String candle = "Candle";
        dropTable.put(candle,1);
    }
}
