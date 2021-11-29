package ru.pankratov.trofimov.vgav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity() : AppCompatActivity() {

    private lateinit var mTextResult: TextView
    private lateinit var keys: Keys

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // убираем ActionBar
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        mTextResult = findViewById(R.id.textView_result)


        val layout: ConstraintLayout = findViewById(R.id.main_layout)
        keys = Keys(layout)
        keys.main()


    }

    override fun onBackPressed() {
        Toast.makeText(this, HelloSashka.getAlexander(), Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }

    companion object {

    }
}