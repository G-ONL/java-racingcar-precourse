package racinggame.model;

import racinggame.view.InputView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RacingCarGame {
    private static final String ERROR = "[ERROR]";

    public static Cars makeCars() {
        Set<Car> cars = new HashSet<>();
        try {
            addCarByName(cars);
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
            makeCars();
        }
        return new Cars(new ArrayList<>(cars));
    }

    private static void addCarByName(Set<Car> cars) {
        String[] names = InputView.inputCarNames();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }
}
