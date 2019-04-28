package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NameActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_actvity)
        Toast.makeText(applicationContext,"네액티비티입니다.", Toast.LENGTH_LONG).show()
    }
}
