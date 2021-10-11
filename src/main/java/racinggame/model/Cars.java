package racinggame.model;

import nextstep.utils.Randoms;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }

    public String getResult() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car.toString()).append("\n");
        }
        result.append("\n");
        return result.toString();
    }
}
