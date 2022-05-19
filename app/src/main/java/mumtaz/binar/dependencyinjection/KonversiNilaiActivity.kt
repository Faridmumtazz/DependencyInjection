package mumtaz.binar.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_konversi_nilai.*
import javax.inject.Inject

class KonversiNilaiActivity : AppCompatActivity() {
    @Inject
    lateinit var konversiNilai: Nilai

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_nilai)

        btnInput.setOnClickListener {
            konversi()
        }
    }

    fun konversi() {
        val a = etNilai.text.toString().toInt()
        val n = konversiNilai.konversiNilai(a)
        when {
            n >= 85 && n <= 100 -> {
                tv_output.text = "A"
            }
            n >= 75 && n <= 84 -> {
                tv_output.text = "B"
            }
            n >= 60 && n <= 74 -> {
                tv_output.text = "C"
            }
            n >= 50 && n <= 59 -> {
                tv_output.text = "D"
            }
            else -> {
                tv_output.text = "E"
            }

        }
    }
}