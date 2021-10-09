package racinggame.model;

import racinggame.common.GameConstant;

public class Car {
    private int position;

    public void move(int num) {
        if (num < GameConstant.STOP_START_VALUE || num > GameConstant.MOVING_END_VALUE)
            throw new IllegalArgumentException();
        if (num >= GameConstant.MOVING_START_VALUE && num <= GameConstant.MOVING_END_VALUE) position++;
    }

    public boolean isNowPosition(int position) {
        return this.position == position;
    }
}
