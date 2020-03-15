package Money;

public class Copper extends Currency{
    private int value = 1;

    public Copper() { }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Copper";
    }
}
