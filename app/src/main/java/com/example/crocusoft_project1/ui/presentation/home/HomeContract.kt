package com.example.crocusoft_project1.ui.presentation.home

import com.example.crocusoft_project1.ui.domain.StoryEntity

sealed interface HomeContract {

    sealed interface Intent{
        object OnFetchStories: Intent
    }


    data class State(
        val stories: List<StoryEntity> = emptyList(),

    )
}