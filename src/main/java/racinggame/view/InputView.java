package racinggame.view;

import nextstep.utils.Console;

public class InputView {
    private static final String CAR_NAME_SPLIT_REGEX = ",";

    public static String[] inputCarNames() {
        return Console.readLine().split(CAR_NAME_SPLIT_REGEX);
    }
}
