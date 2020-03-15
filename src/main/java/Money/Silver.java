package Money;

public class Silver extends Currency{
    private int value = 1;

    public Silver() { }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        value = value;
    }

    @Override
    public String toString() {
        return "Silver";
    }
}
