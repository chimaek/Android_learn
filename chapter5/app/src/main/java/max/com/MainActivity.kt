package max.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomCard.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(getLandomLotto()))

            startActivity(intent)
        }

        makeCard.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        nameCard.setOnClickListener {
            startActivity(Intent(this, NameActvity::class.java))
        }
    }

    fun getRandom(): Int {
        return Random.nextInt(45) + 1
    }

    fun getLandomLotto():MutableList<Int>{
        val list = mutableListOf<Int>()

        for(number in 1..45){
            list.add(number)
        }
        list.shuffle()

        return list.subList(0,6)
    }
    // 중복숫자 제거
//    fun getLandomLotto(): MutableList<Int> {
//
//        val lottoNum = mutableListOf<Int>()
//
//        for (i in 1..6) {
//            var number = 0
//            do{
//                number = getRandom()
//            }while (lottoNum.contains(number))
//            lottoNum.add(number)
//        }
//
//        return lottoNum
//    }
}
