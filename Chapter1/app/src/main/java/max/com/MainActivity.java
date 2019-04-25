package max.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"안녕",Toast.LENGTH_SHORT).show();

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount += 1;
                if (clickCount % 2 == 0) {
                    Toast.makeText(getApplicationContext(),"ClickCount" + clickCount,Toast.LENGTH_SHORT).show();
                }else if(clickCount % 3 == 0){
                    Toast.makeText(getApplicationContext(),"Hello world!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    int var1 =0;
    {
        var1 = 2; // 접근가능

        int var2 = 0;
    }

//   접근불가 var2 =1;
}
