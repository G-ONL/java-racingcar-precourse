package racinggame.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 숫자_4부터_9까지_움직임() {
        Car car = new Car();
        car.move(3);
        assertThat(car.isNowPosition(1)).isFalse();
        car.move(4);
        assertThat(car.isNowPosition(1)).isTrue();
        car.move(9);
        assertThat(car.isNowPosition(2)).isTrue();
        car.move(10);
        assertThat(car.isNowPosition(3)).isFalse();
    }
}
