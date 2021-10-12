package racinggame.model;

import racinggame.view.OutputView;

public class Race {
    private final int number;

    public Race(int number) {
        this.number = number;
    }

    public Result start(Cars cars) {
        OutputView.printResultGuideMessage();
        Result result = null;
        for (int i = 0; i < number; i++) {
            result = Round.start(cars);
        }
        return result;
    }
}
