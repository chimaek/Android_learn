package max.com;

public class MoveObject {
    protected int speed;

    final public void addSpeed(int param) {
        this.speed = speed + param;
    }

    final public int getSpeed() {
        return speed;
    }

    public int x, y;
}
