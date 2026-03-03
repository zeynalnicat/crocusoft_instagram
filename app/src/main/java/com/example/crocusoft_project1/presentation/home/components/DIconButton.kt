package com.example.crocusoft_project1.presentation.home.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.crocusoft_project1.core.Colors
import com.example.crocusoft_project1.core.theme.Black
import com.example.crocusoft_project1.core.theme.White


@Composable
fun DIconButton(
    icon: Int,
    iconColor: Color = Black,
    onClick: () -> Unit,

    ) {
    IconButton(
        onClick = onClick,
    ) {
        Icon(
            tint = iconColor ,
            painter = painterResource(icon),
            contentDescription = null
        )
    }
}