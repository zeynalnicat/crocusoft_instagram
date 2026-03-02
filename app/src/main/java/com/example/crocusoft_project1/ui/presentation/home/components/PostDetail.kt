package com.example.crocusoft_project1.ui.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.crocusoft_project1.R
import com.example.crocusoft_project1.ui.core.DTextStyle
import com.example.crocusoft_project1.ui.core.DsTheme
import com.example.crocusoft_project1.ui.domain.entities.PostEntity
import com.example.crocusoft_project1.ui.presentation.home.HomeContract

@Composable
fun PostDetail(
    post: PostEntity,
    postIntent: (HomeContract.Intent) -> Unit
) {

    val context = LocalContext.current



    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = DsTheme.dimens.dp2)

        ) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(DsTheme.dimens.dp2),
                verticalAlignment = Alignment.CenterVertically,

                ) {

                ProfileAvatar(
                    imgUri = post.userUri,
                    size = DsTheme.dimens.dp8,
                    padding = 0.dp
                )

                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = post.username,
                        style = DTextStyle.t14Bold
                    )

                    Text(
                        text = post.location,
                        style = DTextStyle.t12
                    )
                }
            }

            DIconButton(R.drawable.more) { postIntent(HomeContract.Intent.OnToggleMore) }

        }

        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(
                    minWidth = DsTheme.dimens.postMinWidth,
                )
                .widthIn(DsTheme.dimens.postMaxWidth)
                .heightIn(max = DsTheme.dimens.postMaxHeight),

            model = ImageRequest.Builder(context)
                .data(post.contents[0])
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                DIconButton(R.drawable.like) {
                    postIntent(HomeContract.Intent.OnLikePost(post))

                }
                DIconButton(R.drawable.comment) {
                    postIntent(HomeContract.Intent.OnComment)

                }
                DIconButton(R.drawable.messanger) {
                    postIntent(HomeContract.Intent.OnShare(post))

                }
            }

            DIconButton(R.drawable.save) { postIntent(HomeContract.Intent.OnSave(post)) }
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = DsTheme.dimens.dp2),
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(fontWeight = FontWeight.Bold)
                ) {
                    append(post.username)
                }
                append(" ")
                append(post.description)
            },
            style = DsTheme.textStyle.t12
        )

        Spacer(modifier = Modifier.height(height = DsTheme.dimens.dp3))

        Text(
            modifier = Modifier.padding(DsTheme.dimens.dp2),
            text = post.date,
            style = DsTheme.textStyle.t12Gray,

        )


    }

}


