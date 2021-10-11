package racinggame.view;

import nextstep.utils.Console;

public class InputView {
    private static final String CAR_NAME_SPLIT_REGEX = ",";
    private static final String ONLY_NUMBER_REGEX = "^[0-9]+$";

    public static String[] inputCarNames() {
        return Console.readLine().split(CAR_NAME_SPLIT_REGEX);
    }

    public static int inputGameNumber() {
        String input = Console.readLine();
        if (!input.matches(ONLY_NUMBER_REGEX)) throw new IllegalArgumentException();
        return Integer.parseInt(input);
    }
}
