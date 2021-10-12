package racinggame.controller;

import racinggame.model.Cars;
import racinggame.model.RacingCarGame;

public class RacingCarController {

    public static void start() {
        Cars cars = RacingCarGame.makeCars();
    }
}
