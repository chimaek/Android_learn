package max.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_view_binding.*

class BMIKOTLINActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        btnBMI.setOnClickListener {
            val heightval = height.text.toString().toDouble();

            val weightval = weight.text.toString().toDouble();

            val bmi = weightval / Math.pow(heightval / 100, 2.0);

            resultLabel.text = "키: ${height.text} 체중 : ${weight.text}  BMI : $bmi"

        }
    }
}
