package com.example.crocusoft_project1.ui.presentation.home

import com.example.crocusoft_project1.ui.domain.entities.PostDetailsEntity
import com.example.crocusoft_project1.ui.domain.entities.StoryEntity

sealed interface HomeContract {

    sealed interface Intent {
        data object OnFetchStories : Intent

        data object OnToggleMore : Intent

        data class OnLikePost(val postEntity: PostDetailsEntity) : Intent

        data object OnComment : Intent

        data class OnShare(val postEntity: PostDetailsEntity) : Intent

        data class OnSave(val postEntity: PostDetailsEntity) : Intent

    }


    data class State(
        val stories: List<StoryEntity> = emptyList(),

        )
}