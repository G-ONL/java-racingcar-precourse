package racinggame.utils;

import java.util.Objects;

public class ValidationUtils {

    public static void validNumber(String input) {
        if (Objects.isNull(input) || !input.matches("^[0-9]+$")) throw new IllegalArgumentException();
    }
}
