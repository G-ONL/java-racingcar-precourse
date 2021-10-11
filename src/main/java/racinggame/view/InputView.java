package racinggame.view;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

public class InputView {
    private static final String CAR_NAME_SPLIT_REGEX = ",";
    private static final String INPUT_CAR_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_GAME_NUMBER_GUIDE_MESSAGE = "시도할 회수는 몇회인가요?";

    public static String[] inputCarNames() {
        System.out.println(INPUT_CAR_NAME_GUIDE_MESSAGE);
        return Console.readLine().split(CAR_NAME_SPLIT_REGEX);
    }

    public static int inputGameNumber() {
        String input;
        do {
            System.out.println(INPUT_GAME_NUMBER_GUIDE_MESSAGE);
            input = Console.readLine();
        } while (ValidationUtils.validGameNumber(input));
        return Integer.parseInt(input);
    }
}
