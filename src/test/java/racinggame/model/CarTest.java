package racinggame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    Car car;

    @BeforeEach
    void init() {
        car = new Car("name");
    }

    @Test
    void 숫자_4미만인_경우_정지한다() {
        car.move(3);
        assertThat(car.isSamePosition(1)).isFalse();
    }

    @Test
    void 숫자_0미만인_경우_exception() {
        assertThatThrownBy(() -> {
            car.move(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_4이상인_경우_전진한다() {
        car.move(4);
        assertThat(car.isSamePosition(1)).isTrue();
    }

    @Test
    void 숫자_9초과인_경우_exception() {
        assertThatThrownBy(() -> {
            car.move(10);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름_5자_넘으면_exception() {
        assertThatThrownBy(() -> {
            Car car = new Car("abcdefg");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
