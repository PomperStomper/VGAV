package ru.pankratov.trofimov.vgav

import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Keys(layout: ConstraintLayout) {

    var key: ArrayList<Button> = ArrayList()
    var layout: ConstraintLayout = layout

    fun main() {
        key.add(layout.findViewById(R.id.button555))
        key.add(layout.findViewById(R.id.button2555))
        key.add(layout.findViewById(R.id.button4555))
        key.add(layout.findViewById(R.id.button5555))

        key[0].setText("ИМЕ")
        key[1].setText("НА")
        key[2].setText("ГОВ")
        key[3].setText("НО")


    }


}