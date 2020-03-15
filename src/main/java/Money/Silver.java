package Money;

public class Silver extends Currency{
    int Value = 1;

    public Silver() {

    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Silver";
    }
}
