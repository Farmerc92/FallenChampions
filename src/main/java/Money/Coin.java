package Money;


public enum Coin{
    GOLD(1),
    SILVER(1),
    COPPER(1);

    private final int value;

    Coin (int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return value;
    }

}
