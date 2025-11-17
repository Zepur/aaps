// In .../helpers/BackgroundProvider.kt

package app.aaps.ui.helpers

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import androidx.core.content.ContextCompat

// Change 'class' to 'object'. This makes it a singleton.
object BackgroundProvider {

    // This property will hold our single, shared background instance.
    // It is nullable so we know if it has been created yet.
    private var mainBackground: Drawable? = null

    /**
     * Gets the single shared background for the entire app.
     * The first time this is called, it creates the gradient and stores it.
     * Every subsequent call will return the *exact same* drawable instance.
     */
    fun getAppBackground(context: Context): Drawable {
        // This is the "lazy initialization" part.
        // If mainBackground is null, create it. Otherwise, just return it.
        if (mainBackground == null) {
            mainBackground = createAndStoreBackground(context.applicationContext)
        }
        // The '!!' is safe because we just guaranteed it's not null.
        return mainBackground!!
    }

    /**
     * This function creates the background and stores it in our private property.
     * It should only be called once by getAppBackground().
     */
    private fun createAndStoreBackground(context: Context): GradientDrawable {
        val backgroundColors = intArrayOf(
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.grad_blue_dark),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.gradient_mid_dark),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.grad_blue_light),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.gradient_mid_light)
        )

        val positions = floatArrayOf(0.0f, 0.36f, 0.78f, 1.0f)

        return GradientDrawable().apply {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM
            setColors(backgroundColors, positions)
        }
    }

    /**
     * A separate public function to create a NEW, different background for dialogs.
     * This will be the "flipped" version.
     */
    fun createDialogBackground(context: Context): GradientDrawable {
        val backgroundColors = intArrayOf(
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.gradient_mid_light),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.grad_blue_light),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.gradient_mid_dark),
            ContextCompat.getColor(context, app.aaps.core.ui.R.color.grad_blue_dark)
        )
        val positions = floatArrayOf(0.0f, 0.22f, 0.64f, 1.0f) // Flipped positions
        return GradientDrawable().apply {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM
            setColors(backgroundColors, positions)
        }
    }
}
