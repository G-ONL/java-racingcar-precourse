package racinggame.utils;

import java.util.Objects;

public class ValidationUtils {
    private static final String ONLY_NUMBER = "^[0-9]+$";
    private static final char COMMA = ',';
    private static final int ZERO = 0;
    private static final int MAXIMUM_NAME_LENGTH = 5;

    public static void validNumber(String input) {
        if (Objects.isNull(input) || !input.matches(ONLY_NUMBER) || isZero(input)) throw new IllegalArgumentException();
    }

    private static boolean isZero(String input) {
        return Integer.parseInt(input) == ZERO;
    }

    public static void validNullAndEmpty(String input) {
        if (Objects.isNull(input) ||
                input.isEmpty()) throw new IllegalArgumentException();
    }

    public static void validLastCharComma(String input) {
        if (input.charAt(input.length() - 1) == COMMA) throw new IllegalArgumentException();
    }

    public static void validNameLength(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) throw new IllegalArgumentException();
    }

    public static void checkLength(int size1, int size2) {
        if (size1 != size2) throw new IllegalArgumentException();
    }
}
