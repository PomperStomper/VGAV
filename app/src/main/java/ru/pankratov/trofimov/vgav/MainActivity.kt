package ru.pankratov.trofimov.vgav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var mTextResult: TextView
    private lateinit var keys: Keys
    private lateinit var calc: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // убираем ActionBar
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        mTextResult = findViewById(R.id.textView_result)

        // Подписывайте пжл, ВГ, что Вы тут делаете )
        val layout: ConstraintLayout = findViewById(R.id.main_layout)
        keys = Keys(layout)
        keys.main()
        // добавил слушателей на кнопки
        addListenersInBtn()
        // расчеты
        calc = Calculator()

    }

    // обработка нажатий
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_one -> onBackPressed()
            R.id.btn_two -> onBackPressed()
            R.id.btn_three -> onBackPressed()
            R.id.btn_four -> onBackPressed()
            R.id.btn_five -> onBackPressed()
            R.id.btn_six -> onBackPressed()
            R.id.btn_seven -> onBackPressed()
            R.id.btn_eight -> onBackPressed()
            R.id.btn_nine -> onBackPressed()
            R.id.btn_zero_zero -> onBackPressed()
            R.id.btn_zero -> onBackPressed()
            R.id.btn_discharge -> onBackPressed()
            R.id.btn_percent -> onBackPressed()
            R.id.btn_erase -> onBackPressed()
            R.id.btn_divide -> onBackPressed()
            R.id.btn_multiply -> onBackPressed()
            R.id.btn_minus -> onBackPressed()
            R.id.btn_plus -> onBackPressed()
            R.id.btn_point -> onBackPressed()
            R.id.btn_equals -> onBackPressed()
        }
    }

    private fun addListenersInBtn() {
        for (i in keys.key)
            i.setOnClickListener(this)
    }

    override fun onBackPressed() {
        Toast.makeText(this, HelloSashka.getAlexander(), Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }

}