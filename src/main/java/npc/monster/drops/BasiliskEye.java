package npc.monster.drops;



public class BasiliskEye extends Item implements Dropable {

    private Object BasiliskEye;

    @Override
    public int value() {
        return 100;
    }
    
    public void addToLootTable(){
        dropTable.put(BasiliskEye,1);
    }
}
