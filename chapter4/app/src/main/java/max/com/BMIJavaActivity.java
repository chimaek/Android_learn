package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIJavaActivity extends AppCompatActivity {

    private EditText textField;
    private String height;
    private EditText textField2;
    private double bmi;
    private TextView textView;
    private String weight;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        textField = findViewById(R.id.height);
        textField2 = findViewById(R.id.weight);
        textView = findViewById(R.id.resultLabel);
        btn1 = findViewById(R.id.btnBMI);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height = textField.getText().toString();
                weight = textField2.getText().toString();
                bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(height) / 100.0, 2);
                textView.setText("키 : " + height + "체중 : " + weight + "BMI : " + bmi);


            }
        });

    }
}
