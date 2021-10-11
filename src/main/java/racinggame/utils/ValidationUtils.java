package racinggame.utils;

public class ValidationUtils {
    private static final String ONLY_NUMBER_REGEX = "^[0-9]+$";
    private static final String ERROR_MESSAGE = "[ERROR] 다시 입력해주세요.";

    public static boolean validGameNumber(String input) {
        try {
            IllegalExceptionIfNotNumber(input);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE);
            return false;
        }
    }

    private static void IllegalExceptionIfNotNumber(String input) {
        if (!input.matches(ONLY_NUMBER_REGEX)) {
            throw new IllegalArgumentException();
        }
    }
}
