package racinggame.view;

import nextstep.utils.Console;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mockStatic;

public class InputViewTest {

    @ParameterizedTest
    @CsvSource(value = {"faker,show,maker:3", "faker:1"}, delimiter = ':')
    void 쉼표_기준으로_문자열_자르기(String inputValue, int length) {
        try (final MockedStatic<Console> mockConsole = mockStatic(Console.class)) {
            mockConsole.when(() -> Console.readLine())
                    .thenReturn(inputValue);
            String[] carNames = InputView.inputCarNames();
            assertThat(carNames.length).isEqualTo(length);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"가", "", "!", "abs"})
    void 숫자만_입력이_가능하다(String inputValue) {
        try (final MockedStatic<Console> mockConsole = mockStatic(Console.class)) {
            mockConsole.when(() -> Console.readLine())
                    .thenReturn(inputValue);
            assertThatThrownBy(() -> InputView.inputGameNumber()).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
