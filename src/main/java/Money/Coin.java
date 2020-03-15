package Money;


public enum Coin{
    GOLD(1),
    SILVER(1),
    COPPER(1);

    int value;

    Coin (int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
