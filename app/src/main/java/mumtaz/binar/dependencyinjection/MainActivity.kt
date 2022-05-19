package mumtaz.binar.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var namaStudent: Student
    @Inject
    lateinit var c: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            hitung()
        }


    }

    fun hitung(){
        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()
        val di = namaStudent.hitungJumlah(a, b)
        tv_hasil.text = di.toString()
    }
}