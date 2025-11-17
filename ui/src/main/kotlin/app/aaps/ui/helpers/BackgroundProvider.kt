package app.aaps.ui.helpers

import android.graphics.drawable.GradientDrawable
import android.content.Context
import androidx.core.content.ContextCompat.getColor

class BackgroundProvider {

    fun createBackground(context: Context, flipped: Boolean): GradientDrawable {
        val backgroundColors =
            if (flipped) {
                intArrayOf(
                    getColor(context, app.aaps.core.ui.R.color.grad_blue_dark),
                    getColor(context, app.aaps.core.ui.R.color.gradient_mid_dark),
                    getColor(context, app.aaps.core.ui.R.color.grad_blue_light),
                    getColor(context, app.aaps.core.ui.R.color.gradient_mid_light)
                )
            } else {
                intArrayOf(
                    getColor(context, app.aaps.core.ui.R.color.grad_blue_dark),
                    getColor(context, app.aaps.core.ui.R.color.gradient_mid_dark),
                    getColor(context, app.aaps.core.ui.R.color.grad_blue_light)
                )
            }

        val positions = if (flipped) {
            floatArrayOf(0.0f, 0.36f, 0.78f, 1.0f)
        } else {
            floatArrayOf(1.0f, 0.42f, 0.0f)
        }

        val linearGradient = GradientDrawable()
        linearGradient.orientation = GradientDrawable.Orientation.TOP_BOTTOM
        linearGradient.setColors(backgroundColors, positions)
        return linearGradient
    }

}