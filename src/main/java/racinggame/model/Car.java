package racinggame.model;

import racinggame.utils.GameConstant;
import racinggame.utils.ValidationUtils;
import racinggame.view.OutputView;

import java.util.Objects;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        ValidationUtils.validNameLength(name);
        this.name = name;
    }


    public void move(int num) {
        if (num < GameConstant.STOP_MIN
                || num > GameConstant.MOVING_MAX)
            throw new IllegalArgumentException();
        if (num >= GameConstant.MOVING_MIN)
            position++;
    }

    public boolean isNowPosition(int position) {
        return this.position == position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public void printPosition() {
        OutputView.printPosition(name, position);
    }
}
