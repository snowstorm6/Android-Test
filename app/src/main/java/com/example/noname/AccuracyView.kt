package com.example.noname

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class AccuracyView(context: Context, attrs: AttributeSet?) :
    View(context, attrs) {

    private val circlePaint = Paint()
        .apply {
            style = Paint.Style.STROKE
            color = Color.BLACK
            strokeWidth = 5f
        }

    var accuracy = 0f
        set(value) {
            field = value
            invalidate()
        }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas!!.drawCircle(
            (width / 2).toFloat(),
            (height / 2).toFloat(),
            (width / 2).toFloat() / 100 * accuracy,
            circlePaint
        )
    }

}