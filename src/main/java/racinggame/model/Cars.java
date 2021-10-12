package racinggame.model;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return new ArrayList<>(this.cars);
    }

    public void moveCar() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }
    }
}
