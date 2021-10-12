package racinggame.model;

import racinggame.utils.ValidationUtils;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacingCarGame {

    public static Cars makeCars() {
        List<Car> cars = new ArrayList<>();
        try {
            addCarByName(cars);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage();
            makeCars();
        }
        return new Cars(cars);
    }

    public static Race initRace() {
        return new Race(InputView.inputGameNumber());
    }

    private static void addCarByName(List<Car> cars) {
        Set<Car> notDuplicateCars = new HashSet<>();
        String[] names = InputView.inputCarNames();
        for (String name : names) {
            cars.add(new Car(name));
            notDuplicateCars.add(new Car(name));
        }
        ValidationUtils.checkLength(cars.size(), notDuplicateCars.size());
    }
}
