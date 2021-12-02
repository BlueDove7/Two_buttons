package pl.karolcia.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)  ///aplikacja idzie od zera
        setContentView(R.layout.activity_main)

        val btnClickMe1 = findViewById<Button>(R.id.button1)
        val btnClickMe2 = findViewById<Button>(R.id.button2)
//btnClickMe.text = " 1 Pielucha"

       /* btnClickMe1.setOnClickListener {
            btnClickMe1.text = "HAHA, you clck"
        }*/

        val textClickMe = findViewById<TextView>(R.id.textView)
        val textClickMe2 = findViewById<TextView>(R.id.textView2)
        val textClickMe3 = findViewById<TextView>(R.id.textView3)
        var licznik_pieluch_Marcina =0
        var licznik_pieluch_Karolci =0
        var licznik_sumy = 0
val Karoliny_pieluchy = "Karoliny Pieluchy:   "
        val Marcina_pieluchy = "Marcina Pieluchy:   "

        btnClickMe1.setOnClickListener {
            licznik_pieluch_Marcina = licznik_pieluch_Marcina + 1
licznik_sumy += 1
            textClickMe2.text = Marcina_pieluchy + licznik_pieluch_Marcina.toString()
            textClickMe.text = licznik_sumy.toString()

            Toast.makeText(this, "Hey, I am toast", Toast.LENGTH_LONG).show()
        }
        btnClickMe2.setOnClickListener {
            licznik_pieluch_Karolci = licznik_pieluch_Karolci + 1
            licznik_sumy += 1
            textClickMe.text = licznik_sumy.toString()
            textClickMe3.text =  Karoliny_pieluchy + licznik_pieluch_Karolci.toString()

            Toast.makeText(this, "Hey, I am toast", Toast.LENGTH_LONG).show()
        }
    }
}