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

public class RoundTest {
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
    void 라운드_우승자_찾기() {
        try (MockedStatic<Randoms> randomsMock = mockStatic(Randoms.class)) {
            randomsMock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5)
                    .thenReturn(1)
                    .thenReturn(1);
            assertThat(Round.start(cars).getWinners()).contains("faker");
        }
    }
}
