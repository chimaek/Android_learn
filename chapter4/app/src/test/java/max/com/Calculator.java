package max.com;

public class Calculator {

    public static int calACC(MoveObject moveObject, int attack) {

        if (moveObject.getSpeed() == 0) {
            moveObject.addSpeed(1);
        }

        double result = attack / moveObject.getSpeed();
        return (int) result;
    }
}
