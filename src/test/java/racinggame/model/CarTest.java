package racinggame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.common.GameConstant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("faker");
    }

    @Test
    void 숫자_4부터_9까지_움직임() {
        car.move(GameConstant.MOVING_MIN);
        assertThat(car.isNowPosition(1)).isTrue();
        car.move(GameConstant.MOVING_MAX);
        assertThat(car.isNowPosition(2)).isTrue();
        assertThatThrownBy(() -> {
            car.move(10);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_0부터_3까지_멈춤() {
        assertThatThrownBy(() -> {
            car.move(-1);
        }).isInstanceOf(IllegalArgumentException.class);
        car.move(GameConstant.STOP_MIN);
        assertThat(car.isNowPosition(0)).isTrue();
        car.move(GameConstant.STOP_MAX);
        assertThat(car.isNowPosition(0)).isTrue();
    }

    @Test
    void 이름은_5자_초과일_경우_exception() {
        assertThatThrownBy(() -> {
            Car longNameCar = new Car("abcdef");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름은_empty일_경우_exception() {
        assertThatThrownBy(() -> {
            Car emptyNameCar = new Car("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름은_null일_경우_exception() {
        assertThatThrownBy(() -> {
            Car longNameCar = new Car(null);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
