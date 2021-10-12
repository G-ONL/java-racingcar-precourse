package racinggame.view;

import racinggame.model.Car;
import racinggame.model.Cars;

import java.util.List;

public class OutputView {
    private static final String POSITION_UNIT = "-";
    private static final String WINNER_SEPARATOR = ",";
    private static final String WINNER_MESSAGE = "최종 우승자는 %s 입니다.\n";
    private static final String RESULT_GUIDE_MESSAGE = "실행 결과";
    private static final String CAR_NAME_AND_SCORE = "%s : %s \n";
    private static final String ERROR = "[ERROR]";

    public static void printPlayerNameAndScore(Cars cars) {
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            System.out.printf(CAR_NAME_AND_SCORE, car.getName(), getPositionView(car.getPosition()));
        }
        System.out.println();
    }

    private static String getPositionView(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(POSITION_UNIT);
        }
        return stringBuilder.toString();
    }

    public static void printResultGuideMessage() {
        System.out.println();
        System.out.println(RESULT_GUIDE_MESSAGE);
    }

    public static void printWinner(List<String> winners) {
        System.out.printf(WINNER_MESSAGE, String.join(WINNER_SEPARATOR, winners));
    }

    public static void printErrorMessage() {
        System.out.println(ERROR);
    }
}
