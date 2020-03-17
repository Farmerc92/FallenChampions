package npc.monster.drops;

public class Apple extends Item implements Dropable{
    @Override
    public int value() {
        return 3;
    }

    @Override
    public void addToLootTable() {
        String apple = "Apple";
        dropTable.put(apple,1);
    }
}
