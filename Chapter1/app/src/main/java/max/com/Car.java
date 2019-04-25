package max.com;

public class Car {

    private int cSpeed = 0;
    private int aceel = 3;
    private int maxSpeed = 100;
    private int breakSpeed = 4;

    public void accelerate() {
        cSpeed = cSpeed + aceel;
        if (cSpeed > maxSpeed) {
            cSpeed = maxSpeed;
        }
    }

    public Car(int aceel, int maxSpeed, int breakspeed) {
        this.aceel = aceel;
        this.maxSpeed = maxSpeed;
        this.breakSpeed = breakspeed;
    }

    public void breakpedal() {
        cSpeed = cSpeed - breakSpeed;
        if (cSpeed < 0) {
            cSpeed = 0;
        }
    }

    public String getcSpeedText(){
        return "현재 속도는 "+this.cSpeed + "km/h 입니다.";
    }
}
