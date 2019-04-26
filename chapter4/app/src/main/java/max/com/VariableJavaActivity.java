package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    int clickcount = 0;

    long startTimer = System.currentTimeMillis();

    TextView startLabel;

    TextView clickCountlabel;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        startLabel = findViewById(R.id.startlabel);

        clickCountlabel = findViewById(R.id.clickCount);

        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTimer);

        startLabel.setText("Activity시작시간 : " + timeText);

        clickCountlabel.setText("버튼이 클릭된 횟수: " + clickcount);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount += 1;

                clickCountlabel.setText("버튼이 클릭된 횟수:" + clickcount);
            }
        });
    }
}
