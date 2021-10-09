package racinggame.view;

import nextstep.utils.Console;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

public class InputViewTest {

    @Test
    void 쉼표_기준으로_문자열_자르기() {
        try (final MockedStatic<Console> mockConsole = mockStatic(Console.class)) {
            mockConsole.when(() -> Console.readLine())
                    .thenReturn("faker,show,maker")
                    .thenReturn("faker");

            String[] carNames = InputView.inputCarNames();
            assertThat(carNames).isEqualTo(new String[]{"faker", "show", "maker"});
            assertThat(carNames.length).isEqualTo(3);

            String[] carName = InputView.inputCarNames();
            assertThat(carName).isEqualTo((new String[]{"faker"}));
            assertThat(carName.length).isEqualTo(1);
        }
    }
}
