package max.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_actvity.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class NameActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_actvity)

        goBtn.setOnClickListener {
            if(TextUtils.isEmpty(editText.text.toString())) return@setOnClickListener
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getLottoHash(editText.text.toString())))
            intent.putExtra("name",editText.text.toString())

            startActivity(intent)
        }

        backBtn.setOnClickListener {
            finish()
        }
    }

    /*
    *   입력받은 이름에대한 해시코드를 사용하여 로또 번호를 섞고 결과 반환
    * */
    fun getLottoHash(name: String): MutableList<Int> {
        val list = mutableListOf<Int>()

        for (number in 1..45) {
            list.add(number)
        }

        val targetString = SimpleDateFormat("yyyy-mm-dd", Locale.KOREA).format(Date()) + name

        list.shuffle(Random(targetString.hashCode().toLong()))

        return list.subList(0, 6)
    }
}
