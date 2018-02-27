package `in`.sunsoft.com.getmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickCalculateAge(view: View) {
        var  enterYear:Int = enterYear.text.toString().toInt()
        var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR).toString().toInt()
        var age:Int = currentYear -enterYear
        println(age)

        ageResult.text = "Your age is $age years"

    }
}
