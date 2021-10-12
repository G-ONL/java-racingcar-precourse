package racinggame.model;

import nextstep.utils.Randoms;
import racinggame.view.OutputView;

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

    public void printPositions() {
        OutputView.printPositions(cars);
    }
}
