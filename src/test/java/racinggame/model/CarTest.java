package racinggame.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 숫자_4미만인_경우_정지한다() {
        Car car = new Car();
        car.move(3);
        Position position = new Position();
        position.moveForward();
        assertThat(car.isSamePosition(position)).isFalse();
    }

    @Test
    void 숫자_0미만인_경우_exception() {
        Car car = new Car();
        assertThatThrownBy(() -> {
            car.move(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_4이상인_경우_전진한다() {
        Car car = new Car();
        car.move(4);
        Position position = new Position();
        position.moveForward();
        assertThat(car.isSamePosition(position)).isTrue();
    }

    @Test
    void 숫자_9초과인_경우_exception() {
        Car car = new Car();
        assertThatThrownBy(() -> {
            car.move(10);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
