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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position1 = (Position) o;

        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return position;
    }
}
