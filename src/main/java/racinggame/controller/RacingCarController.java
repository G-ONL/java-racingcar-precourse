package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.Race;
import racinggame.model.RacingCarGame;

public class RacingCarController {

    public static void run() {
        Cars cars = RacingCarGame.makeCars();
        Race racing = RacingCarGame.initRace();
        racing.start(cars);
    }
}
