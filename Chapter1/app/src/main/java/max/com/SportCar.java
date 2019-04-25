package max.com;

public class SportCar extends Car {
    //선루프 열려있는지 변수
    private boolean openSun = false;

    public SportCar(int aceel, int maxSpeed, int breakspeed) {
        super(aceel, maxSpeed, breakspeed);
    }

    public void opensunroof() {
        openSun = true;
    }

    public void closesunroof() {
        openSun = false;
    }

    public String getSunroof() {
        if (!openSun) {
            return "선루프는 닫혀있음";
        } else {
            return "선루프는 열려있다.";
        }
    }

    @Override
    public String getcSpeedText(){
        return "스포츠카 입니다." + super.getcSpeedText();
    }
}
