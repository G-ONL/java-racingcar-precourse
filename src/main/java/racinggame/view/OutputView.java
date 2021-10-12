package racinggame.view;

import racinggame.model.Car;

import java.util.List;

public class OutputView {
    private static final String ERROR_MESSAGE = "[ERROR] 다시 입력해주세요.";

    public static void printError() {
        System.out.println(ERROR_MESSAGE);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printPosition(String name, int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        System.out.println(name + ":" + stringBuilder);
    }

    public static void printPositions(List<Car> cars) {
        for (Car car : cars) {
            car.printPosition();
        }
        System.out.println();
    }
}
