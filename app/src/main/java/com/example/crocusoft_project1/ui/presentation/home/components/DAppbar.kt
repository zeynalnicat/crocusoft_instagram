package com.example.crocusoft_project1.ui.presentation.home.components

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.crocusoft_project1.R
import com.example.crocusoft_project1.ui.core.DsTheme


@Composable
fun DAppbar(
    modifier: Modifier = Modifier,
    suffixActionLeft: () -> Unit = {},
    suffixActionRight: () -> Unit = {},
    prefixAction: () -> Unit = {}
) {


    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = DsTheme.dimens.dp3)

    ) {
        IconButton(
            onClick = {
                prefixAction()
            }

        ) {
            Icon(
                painter = painterResource(R.drawable.shape),
                contentDescription = null
            )
        }

        Text(
            text = stringResource(id = R.string.title),
            style = DsTheme.textStyle.tTitle

        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(DsTheme.dimens.dp4)
        ) {
            IconButton(
                onClick = {
                    suffixActionLeft()
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.igtv), contentDescription = null
                )

            }

            IconButton(
                onClick = {
                    suffixActionRight()
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.messanger), contentDescription = null
                )

            }
        }

    }

}