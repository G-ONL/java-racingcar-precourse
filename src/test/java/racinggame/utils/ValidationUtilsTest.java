package racinggame.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"가", "", "!", "abs"})
    void 숫자만_입력이_가능하다(String inputValue) {
        assertThat(ValidationUtils.validGameNumber(inputValue)).isFalse();
    }
}
