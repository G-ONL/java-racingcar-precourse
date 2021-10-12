package racinggame.model;

public class Car {

    public static final int MOVE_FORWARD_MIN_VALUE = 4;
    public static final int MOVE_FORWARD_MAX_VALUE = 9;
    public static final int STOP_MIN_VALUE = 0;
    private final Position position;

    public Car() {
        this.position = new Position();
    }

    public void move(int value) {
        if (value < STOP_MIN_VALUE || value > MOVE_FORWARD_MAX_VALUE) throw new IllegalArgumentException();
        if (value >= MOVE_FORWARD_MIN_VALUE) position.moveForward();
    }

    public boolean isSamePosition(Position position) {
        return this.position.equals(position);
    }
}
