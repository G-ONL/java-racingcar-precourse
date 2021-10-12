package racinggame.utils;

import java.util.Objects;

public class ValidationUtils {

    public static void validNumber(String input) {
        if (Objects.isNull(input) || !input.matches("^[0-9]+$")) throw new IllegalArgumentException();
    }

    public static void validNullAndEmpty(String input) {
        if (Objects.isNull(input) ||
                isEmpty(input)) throw new IllegalArgumentException();
    }

    private static boolean isEmpty(String input) {
        return input.equals("");
    }

    public static void validNameLength(String name) {
        if (name.length() > 5) throw new IllegalArgumentException();
    }
}
