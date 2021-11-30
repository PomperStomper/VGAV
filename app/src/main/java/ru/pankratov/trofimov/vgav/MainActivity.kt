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
            R.id.btn_one -> calc.pressedDigit()
            R.id.btn_two -> calc.pressedDigit()
            R.id.btn_three -> calc.pressedDigit()
            R.id.btn_four -> calc.pressedDigit()
            R.id.btn_five -> calc.pressedDigit()
            R.id.btn_six -> calc.pressedDigit()
            R.id.btn_seven -> calc.pressedDigit()
            R.id.btn_eight -> calc.pressedDigit()
            R.id.btn_nine -> calc.pressedDigit()
            R.id.btn_zero_zero -> calc.pressedDigit()
            R.id.btn_zero -> calc.pressedDigit()
            R.id.btn_discharge -> calc.pressedClear()
            R.id.btn_percent -> calc.pressedPercent()
            R.id.btn_erase -> calc.pressedErase()
            R.id.btn_divide -> calc.pressedOperator()
            R.id.btn_multiply -> calc.pressedOperator()
            R.id.btn_minus -> calc.pressedOperator()
            R.id.btn_plus -> calc.pressedOperator()
            R.id.btn_point -> calc.pressedDecimalPoint()
            R.id.btn_equals -> calc.pressedEqual()
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