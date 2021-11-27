package ru.pankratov.trofimov.vgav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Toast.makeText(this, "САШКА БЛЯ РАБОТАЕТ!! А ЁПТА", Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }
}