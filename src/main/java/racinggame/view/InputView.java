package racinggame.view;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

public class InputView {
    private static final String GAME_NUMBER_GUIDE_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String ERROR = "[ERROR]";

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
