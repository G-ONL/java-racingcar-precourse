package racinggame.model;

public class Position {
    private static final int DEFAULT_MOVE_VALUE = 1;
    private int position;

    public void moveForward() {
        position += DEFAULT_MOVE_VALUE;
    }

    public int getValue() {
        return position;
    }
}
