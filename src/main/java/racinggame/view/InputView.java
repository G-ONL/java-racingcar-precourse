package racinggame.view;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

public class InputView {
    private static final String GAME_NUMBER_GUIDE_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String CAR_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String NAME_SEPARATOR = ",";

    public static String[] inputCarNames() {
        try {
            System.out.println(CAR_NAME_GUIDE_MESSAGE);
            String input = Console.readLine();
            ValidationUtils.validNullAndEmpty(input);
            ValidationUtils.validLastCharComma(input);
            return input.split(NAME_SEPARATOR);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage();
            return inputCarNames();
        }
    }

    public static int inputGameNumber() {
        try {
            System.out.println(GAME_NUMBER_GUIDE_MESSAGE);
            String input = Console.readLine();
            ValidationUtils.validNumber(input);
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage();
            return inputGameNumber();
        }
    }
}
