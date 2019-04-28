package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Toast.makeText(applicationContext,"결임액티비티입니다.", Toast.LENGTH_LONG).show()
    }
}
