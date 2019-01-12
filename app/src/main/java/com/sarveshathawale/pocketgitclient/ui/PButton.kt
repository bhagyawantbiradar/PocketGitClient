package com.sarveshathawale.pocketgitclient.ui

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

/**
 * Class representing the custom Button View, PButton
 *
 * PButton is same as @see AppCompatButton, but with default font as Montserrat and few font styles.
 * File format is <font-name>-<font-style>.<file-extension>
 */
class PButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        setDefaultFont()
    }

    private fun setDefaultFont() {
        typeface = Typeface.createFromAsset(resources.assets, "fonts/Montserrat-Regular.otf")
    }
}