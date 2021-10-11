package racinggame.model;

import racinggame.utils.ValidationUtils;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RacingCarGame {

    public static Cars makeCars() {
        try {
            Set<Car> cars = validAndInitCars();
            return new Cars(new ArrayList<>(cars));
        } catch (IllegalArgumentException e) {
            OutputView.printError();
            return makeCars();
        }
    }

    private static Set<Car> validAndInitCars() {
        Set<Car> cars = new HashSet<>();
        String[] carNames = InputView.inputCarNames();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        ValidationUtils.validSameNumber(carNames.length, cars.size());
        return cars;
    }
}
