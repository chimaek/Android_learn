package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    int clickcount = 0;
    int clickcount2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        findViewById(R.id.test3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount += 1;

                showMsg(clickcount);
            }
        });

        findViewById(R.id.test4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount2 += 1;

                showMsg(clickcount2);
            }
        });
    }

    private void showMsg(int clickcount) {
        if (clickcount % 2 == 0) {
            Toast.makeText(getApplicationContext(), "클릭횟수" + clickcount, Toast.LENGTH_LONG).show();
        } else if (clickcount % 3 == 0) {
            Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
        }
    }
}
