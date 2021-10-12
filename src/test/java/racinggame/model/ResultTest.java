package racinggame.model;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class ResultTest {
    private Cars cars;

    @BeforeEach
    void init() {
        List<Car> PlayerCars = new ArrayList<>();
        PlayerCars.add(new Car("faker"));
        PlayerCars.add(new Car("maker"));
        PlayerCars.add(new Car("show"));
        cars = new Cars(PlayerCars);
    }

    @Test
    void 제일_먼_위치_값() {
        try (MockedStatic<Randoms> randomsMock = mockStatic(Randoms.class)) {
            randomsMock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5)
                    .thenReturn(5)
                    .thenReturn(5)
                    .thenReturn(1)
                    .thenReturn(1)
                    .thenReturn(5);
            cars.moveCar();
            cars.moveCar();
            assertThat(new Result(cars).getMaxDistance()).isEqualTo(2);
        }
    }

    @Test
    void 우승자_찾기() {
        try (MockedStatic<Randoms> randomsMock = mockStatic(Randoms.class)) {
            randomsMock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5)
                    .thenReturn(5)
                    .thenReturn(5)
                    .thenReturn(1)
                    .thenReturn(1)
                    .thenReturn(5);
            cars.moveCar();
            cars.moveCar();
            assertThat(new Result(cars).getWinners()).contains("show");
        }
    }
}
