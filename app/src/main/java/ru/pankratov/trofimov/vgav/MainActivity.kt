package ru.pankratov.trofimov.vgav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mTextResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextResult = findViewById(R.id.textView_result)

    }

    override fun onBackPressed() {
        Toast.makeText(this, HelloSashka.getAlexander(), Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }

    companion object {

    }
}