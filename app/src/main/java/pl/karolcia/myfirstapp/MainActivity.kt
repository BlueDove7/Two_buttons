package pl.karolcia.myfirstapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import pl.karolcia.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var diaperCounterMarcin = 0
    private var diaperCounterKarolcia = 0

    private val viewBiding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  ///aplikacja idzie od zera //nie aplikacja tylko Activity, aplikacja może się składać z wielu activity
        setContentView(R.layout.activity_main)

        viewBiding.button1.setOnClickListener {
            diaperCounterMarcin++
            viewBiding.textView2.text = "Marcin's Diapers: $diaperCounterMarcin"
            updateSumCounter()
        }
        viewBiding.button2.setOnClickListener {
            diaperCounterKarolcia++
            viewBiding.textView3.text = "Karolcia's Diapers: $diaperCounterKarolcia"
            updateSumCounter()
        }
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return viewBiding.root
    }

    private fun updateSumCounter() {
        viewBiding.textView.text = (diaperCounterMarcin + diaperCounterKarolcia).toString()
    }
}