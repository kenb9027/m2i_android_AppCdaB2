package com.example.appcdab2

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.widget.Button
import androidx.annotation.RequiresApi

class MyButton: androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }
}