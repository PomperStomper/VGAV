package ru.pankratov.trofimov.vgav

import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Keys(layout: ConstraintLayout) {

    var key: ArrayList<Button> = ArrayList()
    var layout: ConstraintLayout = layout

    fun main() {
        key.add(layout.findViewById(R.id.btn_discharge))
        key.add(layout.findViewById(R.id.btn_percent))
        key.add(layout.findViewById(R.id.btn_erase))
        key.add(layout.findViewById(R.id.btn_divide))
        key.add(layout.findViewById(R.id.btn_seven))
        key.add(layout.findViewById(R.id.btn_eight))
        key.add(layout.findViewById(R.id.btn_nine))
        key.add(layout.findViewById(R.id.btn_multiply))
        key.add(layout.findViewById(R.id.btn_four))
        key.add(layout.findViewById(R.id.btn_five))
        key.add(layout.findViewById(R.id.btn_six))
        key.add(layout.findViewById(R.id.btn_minus))
        key.add(layout.findViewById(R.id.btn_one))
        key.add(layout.findViewById(R.id.btn_two))
        key.add(layout.findViewById(R.id.btn_three))
        key.add(layout.findViewById(R.id.btn_plus))
        key.add(layout.findViewById(R.id.btn_zero_zero))
        key.add(layout.findViewById(R.id.btn_zero))
        key.add(layout.findViewById(R.id.btn_point))
        key.add(layout.findViewById(R.id.btn_equals))

    }
}