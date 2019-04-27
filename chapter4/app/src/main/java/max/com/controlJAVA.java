package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class controlJAVA extends AppCompatActivity {

    EditText numberFiled;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_control);
        numberFiled = findViewById(R.id.editText);
        btn = findViewById(R.id.button5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(numberFiled.getText().toString());

                if (number % 2 == 0) {
                    Toast.makeText(getApplicationContext(), number + "는 2의배수입니다.", Toast.LENGTH_SHORT).show();
                } else if (number % 3 == 0) {
                    Toast.makeText(getApplicationContext(), number + "는 3의배수입니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), number, Toast.LENGTH_SHORT).show();
                }
                switch (number) {
                    case 4:
                        btn.setText("실행 -4");
                    case 9:
                        btn.setText("실행 -9");
                    default:
                        btn.setText("실행");
                        break;
                }
            }
        });

    }
}
