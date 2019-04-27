package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickcount = 0

    val Starttime = System.currentTimeMillis()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val timetext = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(Starttime)

        startlabel.text = "액티비티 시작시간 ${timetext}"

        clickCount.text = "클릭한 횟수: ${clickcount}"

        btn.setOnClickListener {
            clickcount += 1

            clickCount.text = "버튼이 클릭된 횟수 : ${clickcount}"
        }

    }

}
