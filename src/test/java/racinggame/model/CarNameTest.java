package racinggame.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "asbsdcs"})
    void 이름_길이가_5자_이하다(String name) {
        assertThatThrownBy(() -> {
            CarName carName = new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
