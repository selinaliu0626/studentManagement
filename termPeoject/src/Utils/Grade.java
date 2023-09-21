package Utils;

public enum Grade {

    A(4),
    B(3),
    C(2),
    D(1),
    F(0);
    int value;

    Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
