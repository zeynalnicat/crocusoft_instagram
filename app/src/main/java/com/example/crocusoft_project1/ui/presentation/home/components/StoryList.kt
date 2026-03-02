package com.example.crocusoft_project1.ui.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.crocusoft_project1.ui.core.DsTheme
import com.example.crocusoft_project1.ui.domain.StoryEntity


@Composable
fun StoryList(
    stories: List<StoryEntity>,
) {

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(DsTheme.dimens.dp5)
    ) {
        items(stories.size) { index ->
            val story = stories[index]
            if (index == 0) {

                Spacer(modifier = Modifier.width(width = DsTheme.dimens.dp3))
            }
            StoryItem(story = story)

            if (index == stories.size - 1) {
                Spacer(modifier = Modifier.width(width = DsTheme.dimens.dp3))
            }
        }
    }

}