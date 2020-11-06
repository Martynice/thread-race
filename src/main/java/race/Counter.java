package race;

public class Counter {
    private static final int END_POINT = 100;
    private int value;

    public int increment() {
        return value++;
    }

    public boolean isValueLessThanEndPoint() {
        return value < END_POINT;
    }
}
