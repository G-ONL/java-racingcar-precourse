package racinggame.utils;

import racinggame.view.OutputView;

public class ValidationUtils {
    private static final String ONLY_NUMBER_REGEX = "^[0-9]+$";
    private static final int NAME_LENGTH_MIN = 1;
    private static final int NAME_LENGTH_MAX = 5;

    public static boolean validGameNumber(String input) {
        try {
            IllegalExceptionIfNotNumber(input);
            return true;
        } catch (IllegalArgumentException e) {
            OutputView.printError();
            return false;
        }
    }

    private static void IllegalExceptionIfNotNumber(String input) {
        if (!input.matches(ONLY_NUMBER_REGEX)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validNameLength(String name) {
        if (name == null
                || name.length() > NAME_LENGTH_MAX
                || name.length() < NAME_LENGTH_MIN)
            throw new IllegalArgumentException();
    }

    public static void validSameNumber(int length, int size) {
        if (length != size) throw new IllegalArgumentException();
    }
}
