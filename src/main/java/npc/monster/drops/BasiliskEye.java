package npc.monster.drops;



public class BasiliskEye extends Item implements Dropable {


    @Override
    public int value() {
        return 100;
    }

    @Override
    public void addToLootTable(){
        String basiliskEye = "Basilisk Eye";
        dropTable.put(basiliskEye,1);
    }
}
