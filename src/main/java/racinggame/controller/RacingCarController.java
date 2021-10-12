package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.Race;
import racinggame.model.RacingCarGame;
import racinggame.model.Result;
import racinggame.view.OutputView;

public class RacingCarController {

    public static void run() {
        Cars cars = RacingCarGame.makeCars();
        Race racing = RacingCarGame.initRace();
        Result result = racing.start(cars);
        OutputView.printWinner(result.getWinners());
    }
}
