package racinggame.model;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {

    private List<Car> manyCar;

    @BeforeEach
    void init() {
        manyCar = new ArrayList<>();
        manyCar.add(new Car("faker"));
        manyCar.add(new Car("show"));
        manyCar.add(new Car("maker"));
    }
}
