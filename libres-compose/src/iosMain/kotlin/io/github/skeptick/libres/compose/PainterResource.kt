package io.github.skeptick.libres.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import io.github.skeptick.libres.images.Image

@Composable
actual fun painterResource(image: Image): Painter = remember {
    IosBitmapPainter(image)
}