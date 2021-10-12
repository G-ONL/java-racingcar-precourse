package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private final Cars cars;

    public Result(Cars cars) {
        this.cars = cars;
    }

    public int getMaxDistance() {
        List<Car> allPlayerCar = cars.getCars();
        int maxPosition = 0;
        for (Car car : allPlayerCar) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public List<String> getWinners() {
        List<Car> allPlayerCar = cars.getCars();
        List<String> winners = new ArrayList<>();
        for (Car car : allPlayerCar) {
            addWinnerIfCarMoveMaxDistance(winners, car);
        }
        return winners;
    }

    private void addWinnerIfCarMoveMaxDistance(List<String> winners, Car car) {
        int maxPosition = getMaxDistance();
        if (car.isSamePosition(maxPosition)) {
            winners.add(car.getName());
        }
    }
}
