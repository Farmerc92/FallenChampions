package Money;

public class Gold extends Currency {
    int value = 1;

    public Gold() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Gold";
    }
}
