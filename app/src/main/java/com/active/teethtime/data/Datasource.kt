package com.active.teethtime.data

import com.active.teethtime.R
import com.active.teethtime.model.Step

class Datasource() {
    fun loadSteps(): List<Step>{
        return listOf<Step>(
            Step(R.string.instr1, R.drawable.test),
            Step(R.string.instr2, R.drawable.test2),
            Step(R.string.instr3, R.drawable.test3),
            Step(R.string.instr4, R.drawable.test4),
            Step(R.string.instr5, R.drawable.test5),
            Step(R.string.instr6, R.drawable.test6),

        )
    }
}