package com.example.crocusoft_project1.ui.presentation.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.crocusoft_project1.R
import com.example.crocusoft_project1.ui.core.DsTheme
import com.example.crocusoft_project1.ui.domain.StoryEntity


@Composable
fun StoryItem(
    story: StoryEntity,
    modifier: Modifier = Modifier,
    onStoryClick: () -> Unit = {},
) {

    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.spacedBy(DsTheme.dimens.dp1),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .size(DsTheme.dimens.storySize)
                .clip(CircleShape)
                .border(
                    border = BorderStroke(
                        DsTheme.dimens.dp02,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                colorResource(id = R.color.yellow),
                                colorResource(id = R.color.red),
                                colorResource(id = R.color.purple),

                                )
                        ),

                        ),
                    shape = CircleShape
                )
                .padding(DsTheme.dimens.dp03)
                .clip(CircleShape)
        ) {

            AsyncImage(
                modifier = Modifier
                    .padding(DsTheme.dimens.dp1)
                    .size(DsTheme.dimens.storyImg)
                    .clip(CircleShape),

                model = ImageRequest.Builder(context)
                    .data(story.imgUri)
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

        }

        Text(
            text = story.name,
            style = DsTheme.textStyle.t12
        )

    }


}


@Preview
@Composable
fun StoryItemPreview() {
    val story = StoryEntity(
        imgUri = "",
        name = "Alice",
        isLive = false

    )

    StoryItem(
        story = story
    )
}