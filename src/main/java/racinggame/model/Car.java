package racinggame.model;

public class Car {

    public static final int MOVE_FORWARD_MIN_VALUE = 4;
    public static final int MOVE_FORWARD_MAX_VALUE = 9;
    public static final int STOP_MIN_VALUE = 0;
    private final Position position;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }

    public void move(int value) {
        if (value < STOP_MIN_VALUE || value > MOVE_FORWARD_MAX_VALUE) throw new IllegalArgumentException();
        if (value >= MOVE_FORWARD_MIN_VALUE) position.moveForward();
    }

    public boolean isSamePosition(int position) {
        return this.position.getValue() == position;
    }

    public String getName() {
        return this.name.getValue();
    }

    public int getPosition() {
        return this.position.getValue();
    }
}
