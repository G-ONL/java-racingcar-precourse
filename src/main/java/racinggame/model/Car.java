package racinggame.model;

public class Car {
    private int position;

    public void move(int num) {
        if(num >= 4) position++;
    }

    public boolean isNowPosition(int position) {
        return this.position == position;
    }
}
