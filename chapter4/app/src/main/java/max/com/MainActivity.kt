package max.com

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//코틀린은 상속을 :으로 표현
class MainActivity : AppCompatActivity() {
    //변수는 클래스앞에 넣는다. ?는 null값 여부
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            (startActivity(Intent(this@MainActivity, BMIJavaActivity::class.java)))
        }

        button2.setOnClickListener {
            (startActivity(Intent(this@MainActivity, BMIKOTLINActivity::class.java)))
        }
        //variable java,kotlin
        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity,VariableJavaActivity::class.java))
        }
        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity,VariableKotlinActivity::class.java))
        }
    }
}
