package racinggame.model;

import racinggame.common.GameConstant;

public class Car {
    private static final int NAME_LENGTH_MIN = 1;
    private static final int NAME_LENGTH_MAX = 5;
    private int position;
    private final String name;

    public Car(String name) {
        if (name == null
                || name.length() > NAME_LENGTH_MAX
                || name.length() < NAME_LENGTH_MIN)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public void move(int num) {
        if (num < GameConstant.STOP_MIN
                || num > GameConstant.MOVING_MAX)
            throw new IllegalArgumentException();
        if (num >= GameConstant.MOVING_MIN
                && num <= GameConstant.MOVING_MAX)
            position++;
    }

    public boolean isNowPosition(int position) {
        return this.position == position;
    }
}
