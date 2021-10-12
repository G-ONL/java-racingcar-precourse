package racinggame.model;

import racinggame.view.OutputView;

public class Round {
    public static Result start(Cars cars) {
        cars.moveCar();
        OutputView.printPlayerNameAndScore(cars);
        return new Result(cars);
    }
}
