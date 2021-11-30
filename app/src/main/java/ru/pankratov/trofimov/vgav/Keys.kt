package ru.pankratov.trofimov.vgav

import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Keys(layout: ConstraintLayout) {

    var layout: ConstraintLayout = layout
    lateinit var key: MutableMap<String, Button>


    fun main() {
        key.put("00", layout.findViewById(R.id.button555))
        key.put("0", layout.findViewById(R.id.button2555))
        key.put(".", layout.findViewById(R.id.button4555))
        key.put("=", layout.findViewById(R.id.button5555))

        key.get("00")?.setText("ИМЕ")
        key.get("0")?.setText("НА")
        key.get(".")?.setText("ГОВ")
        key.get("=")?.setText("НО")


    }


}