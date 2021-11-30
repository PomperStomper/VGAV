package ru.pankratov.trofimov.vgav

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Keys(layout: ConstraintLayout){

    var layout: ConstraintLayout = layout
    var buttons: HashMap<String, Button> = HashMap()
    var need_clear_field: Boolean = true

    fun main() {
        buttons.put("00", layout.findViewById(R.id.button555))
        buttons.put("0", layout.findViewById(R.id.button2555))
        buttons.put(".", layout.findViewById(R.id.button4555))
        buttons.put("=", layout.findViewById(R.id.button5555))

        buttons.put("1", layout.findViewById(R.id.button44))
        buttons.put("2", layout.findViewById(R.id.button244))
        buttons.put("3", layout.findViewById(R.id.button444))
        buttons.put("+", layout.findViewById(R.id.button544))

        buttons.get("00")?.setText("ИМЕ")
        buttons.get("0")?.setText("НА")
        buttons.get(".")?.setText("ГОВ")
        buttons.get("=")?.setText("НО")

        for ((key, value) in buttons) {
            value.setOnClickListener(View.OnClickListener { click(key) })
        }
    }

    fun allExpression() {

    }

    fun click(txt: String) {
        val textView_result: TextView = layout.findViewById(R.id.textView_result)

        if (need_clear_field) {
            textView_result.setText("")
            need_clear_field = false
        }

        var temp_txt = textView_result.getText().toString() + txt
        textView_result.setText(temp_txt)
    }


}