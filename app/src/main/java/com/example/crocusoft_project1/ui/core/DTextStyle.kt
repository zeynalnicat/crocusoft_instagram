package com.example.crocusoft_project1.ui.core

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight


object DTextStyle {

    val tTitle = TextStyle(
        fontSize = DsTheme.dimens.sp8,
        fontWeight = FontWeight.W700
    )

    val t12 = TextStyle(
        fontSize = DsTheme.dimens.sp1,
        fontWeight = FontWeight.W400,
    )

    val t12Bold =
        TextStyle(
            fontSize = DsTheme.dimens.sp1,
            fontWeight = FontWeight.W600,
        )
}