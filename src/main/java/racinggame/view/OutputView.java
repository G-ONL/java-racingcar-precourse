package racinggame.view;

import racinggame.model.Car;
import racinggame.model.Cars;

import java.util.List;

public class OutputView {
    private static final String POSITION_UNIT = "-";

    public static void printPlayerNameAndScore(Cars cars) {
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            System.out.println(car.getName() + " : " + getPositionView(car.getPosition()));
        }
    }

    private static String getPositionView(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(POSITION_UNIT);
        }
        return stringBuilder.toString();
    }
}
