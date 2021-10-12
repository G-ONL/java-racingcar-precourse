package racinggame.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationUtilsTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"가", "@#"})
    void 숫자_이외에_exception(String value) {
        assertThatThrownBy(() -> {
            ValidationUtils.validNumber(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 빈값_null_exception(String value) {
        assertThatThrownBy(() -> {
            ValidationUtils.validNullAndEmpty(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 마지막_글자_콤마이면_exception() {
        assertThatThrownBy(() -> {
            ValidationUtils.validLastCharComma("asdasd,");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
