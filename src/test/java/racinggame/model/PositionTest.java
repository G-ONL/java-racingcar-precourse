package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @DisplayName("default 값 1, 이동시 1만큼 이동")
    @Test
    void 포지션_DEFAULT_값_이동() {
        Position position = new Position();
        position.moveForward();
        assertThat(position.getValue()).isEqualTo(1);
    }
}
