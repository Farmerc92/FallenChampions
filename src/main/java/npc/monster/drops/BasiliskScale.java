package npc.monster.drops;

public class BasiliskScale extends Item implements Dropable{


    @Override
    public int value() {
        return 132;
    }

    public void addToLootTable(){
        String basiliskScale = "Basilisk Scale";
        dropTable.put(basiliskScale, 1);
    }
}
