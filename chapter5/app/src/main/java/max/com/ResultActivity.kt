package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    //로또 1번공 이미지 아이디 사용
    val lottoImageStartId = R.drawable.ball_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result")
        // 전달받은 경우에만 실행
        result?.let {
            // 정렬해서 업데이트
            updateLottoBall(result.sortedBy { it })
        }
    }

    fun updateLottoBall(result: List<Int>) {
        if (result.size < 6) return
        imageView3.setImageResource(lottoImageStartId + (result[0] - 1))
        imageView4.setImageResource(lottoImageStartId + (result[1] - 1))
        imageView5.setImageResource(lottoImageStartId + (result[2] - 1))
        imageView6.setImageResource(lottoImageStartId + (result[3] - 1))
        imageView7.setImageResource(lottoImageStartId + (result[4] - 1))
        imageView8.setImageResource(lottoImageStartId + (result[5] - 1))

    }
}
