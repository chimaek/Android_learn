package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_control.*

class controlKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)


        button5.setOnClickListener {
            val number = editText.text.toString().toInt()

            if (number % 2 == 0) {
                Toast.makeText(applicationContext, "${number} 는 2의배수입니다.", Toast.LENGTH_LONG).show()
            } else if (number % 3 == 0) {
                Toast.makeText(applicationContext, "${number} 는 3의배수입니다.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "${number}", Toast.LENGTH_LONG).show()
            }
            when (number) {
                4 -> button5.text = "실행 -4"
                9 -> button5.text = "실행 -9"
                else -> button5.text = "실행"
            }


        }
    }
}
