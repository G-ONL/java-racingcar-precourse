package racinggame.model;

import racinggame.view.OutputView;

public class Round {
    private final Cars cars;

    public Round(Cars cars) {
        this.cars = cars;
    }

    public void start() {
        cars.moveCar();
        OutputView.printPlayerNameAndScore(cars);
    }
}
