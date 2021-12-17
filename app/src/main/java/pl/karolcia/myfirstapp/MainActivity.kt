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

    private lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  ///aplikacja idzie od zera //nie aplikacja tylko Activity, aplikacja może się składać z wielu activity
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.marcinsBtn.setOnClickListener {
            diaperCounterMarcin++
            viewBinding.marcinsCounter.text = "Marcin's Diapers: $diaperCounterMarcin"
            updateSumCounter()
        }
        viewBinding.karolciasBtn.setOnClickListener {
            diaperCounterKarolcia++
            viewBinding.karolciasCounter.text = "Karolcia's Diapers: $diaperCounterKarolcia"
            updateSumCounter()
        }
    }

    private fun updateSumCounter() {
        viewBinding.diaperCounter.text = (diaperCounterMarcin + diaperCounterKarolcia).toString()
    }
}