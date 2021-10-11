package racinggame.model;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

public class CarsTest {

    private List<Car> manyCar;

    @BeforeEach
    void init() {
        manyCar = new ArrayList<>();
        manyCar.add(new Car("faker"));
        manyCar.add(new Car("show"));
        manyCar.add(new Car("maker"));
    }

    @Test
    void move를_하고_현재_윛_출력하기() {
        Cars cars = new Cars(manyCar);
        try (final MockedStatic<Randoms> mockedRandom = mockStatic(Randoms.class)) {
            mockedRandom.when(() -> Randoms.pickNumberInRange(0, 9))
                    .thenReturn(5)
                    .thenReturn(5)
                    .thenReturn(5);
            cars.move();
            assertThat(cars.getResult()).contains("faker:-");
        }
    }
}
