package com.example.crocusoft_project1.presentation.home.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ProfileAvatar(
    imgUri: String,
    size: Dp,
    padding: Dp,
) {

    val context = LocalContext.current

    AsyncImage(
        modifier = Modifier
            .padding(padding)
            .size(size)
            .clip(CircleShape),


        model = ImageRequest.Builder(context)
            .data(imgUri)
            .crossfade(true)
            .build(),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}