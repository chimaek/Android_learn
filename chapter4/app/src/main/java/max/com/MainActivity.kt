package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//코틀린은 상속을 :으로 표현
class MainActivity : AppCompatActivity() {
        //변수는 클래스앞에 넣는다. ?는 null값 여부
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}