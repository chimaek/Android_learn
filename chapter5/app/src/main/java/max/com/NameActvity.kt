package max.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_actvity.*

class NameActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_actvity)

        goBtn.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }

        backBtn.setOnClickListener {
            finish()
        }
    }
}
