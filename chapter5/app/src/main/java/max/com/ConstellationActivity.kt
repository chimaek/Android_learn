package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstellationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)
        Toast.makeText(applicationContext,"con", Toast.LENGTH_LONG).show()
    }
}
