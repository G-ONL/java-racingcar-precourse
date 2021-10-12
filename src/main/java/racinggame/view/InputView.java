package racinggame.view;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

public class InputView {
    private static final String GAME_NUMBER_GUIDE_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String CAR_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ERROR = "[ERROR]";

    public static String[] inputCarNames() {
        String input = "";
        try {
            System.out.println(CAR_NAME_GUIDE_MESSAGE);
            input = Console.readLine();
            ValidationUtils.validName(input);
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
            inputCarNames();
        }
        return input.split(",");
    }

    public static int inputGameNumber() {
        String input = "";
        try {
            System.out.println(GAME_NUMBER_GUIDE_MESSAGE);
            input = Console.readLine();
            ValidationUtils.validNumber(input);
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
            inputGameNumber();
        }
        return Integer.parseInt(input);
    }

}
