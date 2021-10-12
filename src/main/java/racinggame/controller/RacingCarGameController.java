package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.RacingCarGame;
import racinggame.view.InputView;
import racinggame.view.OutputView;

public class RacingCarGameController {

    public static void start() {
        Cars cars = RacingCarGame.makeCars();
        int gameNumber = InputView.inputGameNumber();
        repeatMoveAndPrintResult(cars, gameNumber);
    }

    private static void repeatMoveAndPrintResult(Cars cars, int gameNumber) {
        OutputView.print("실행 결과");
        for (int i = 0; i < gameNumber; i++) {
            cars.move();
            cars.printPositions();
        }
    }
}
