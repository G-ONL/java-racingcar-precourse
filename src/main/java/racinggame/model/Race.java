package racinggame.model;

public class Race {
    private final int number;

    public Race(int number) {
        this.number = number;
    }

    public void start(Cars cars) {
        for (int i = 0; i < number; i++) {
            Round round = new Round(cars);
            round.start();
        }
    }
}
