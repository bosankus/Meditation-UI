package com.androidplay.mediationui.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

/**
 * Author: Ankush Bose
 * Company: Androidplay.in
 * Created on: 06,August,2021
 */
data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
