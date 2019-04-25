package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Car car1 = new Car(3, 100, 4);
    Car car2 = new Car(10, 50, 8);
    //    int clickcount = 0;
//    int clickcount2 = 0;
    SportCar sportCar = new SportCar(10, 50, 8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        findViewById(R.id.test3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car1.accelerate();
                car2.accelerate();
                String info = "car1 : " + car1.getcSpeedText() + "car2 : " + car2.getcSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                sportCar.opensunroof();
                Toast.makeText(getApplicationContext(), sportCar.getSunroof(), Toast.LENGTH_LONG).show();

            }
        });

        findViewById(R.id.test4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car1.breakpedal();
                car2.breakpedal();
                String info = "car1 : " + car1.getcSpeedText() + "car2 : " + car2.getcSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                sportCar.closesunroof();
                Toast.makeText(getApplicationContext(), sportCar.getSunroof(), Toast.LENGTH_LONG).show();

            }
        });

    }
}

//        findViewById(R.id.test3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickcount += 1;
//
//                showMsg(clickcount);
//                Toast.makeText(getApplicationContext(), showMsg2(clickcount), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        findViewById(R.id.test4).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickcount2 += 1;
//
//                showMsg(clickcount2);
//                Toast.makeText(getApplicationContext(), showMsg2(clickcount2), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private void showMsg(int clickcount) {
//        if (clickcount % 2 == 0) {
//            Toast.makeText(getApplicationContext(), "클릭횟수" + clickcount, Toast.LENGTH_LONG).show();
//        } else if (clickcount % 3 == 0) {
//            Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    private String showMsg2(int clickcount) {
//        if (clickcount % 2 == 0) {
//            return "클릭횟수:" + clickcount ;
//        } else if (clickcount % 3 == 0) {
//            return "Hello Korea!";
//        } else {
//            return "Hello";
//        }
//
//    }


