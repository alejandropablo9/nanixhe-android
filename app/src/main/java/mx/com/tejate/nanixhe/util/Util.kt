package mx.com.tejate.nanixhe.util

import android.graphics.Color
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import androidx.compose.ui.graphics.Color as ColorCompose
import java.util.*

object Util {

    fun randomBaseColor(base: Int = Color.argb(255, 255, 255, 255)): ColorCompose {
        val random = Random()
        var baseRed = random.nextInt(256)
        var baseBlue = random.nextInt(256)
        var baseGreen = random.nextInt(256)

        baseRed = ((baseRed + base.red) / 2)
        baseGreen = ((baseGreen + base.green) / 2)
        baseBlue = ((baseBlue + base.blue) / 2)

        return ColorCompose(baseRed, baseGreen, baseBlue)
    }
}