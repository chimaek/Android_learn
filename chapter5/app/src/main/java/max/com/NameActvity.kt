package max.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_actvity.*
import kotlin.random.Random

class NameActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_actvity)

        goBtn.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(getLottoHash(editText.text.toString())))
            startActivity(intent)
        }

        backBtn.setOnClickListener {
            finish()
        }
    }

    fun getLottoHash(name: String): MutableList<Int> {
        val list = mutableListOf<Int>()

        for (number in 1..45) {
            list.add(number)
        }
        list.shuffle(Random(name.hashCode().toLong()))
        return list.subList(0, 6)
    }
}
