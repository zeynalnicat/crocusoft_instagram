package com.example.crocusoft_project1.ui.presentation.home.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.crocusoft_project1.R
import com.example.crocusoft_project1.ui.presentation.home.HomeContract


@Composable
fun DIconButton(
    icon: Int,
    onClick: () -> Unit
) {

    IconButton(
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null
        )
    }
}