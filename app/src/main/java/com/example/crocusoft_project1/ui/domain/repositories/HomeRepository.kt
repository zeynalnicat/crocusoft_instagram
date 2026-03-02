package com.example.crocusoft_project1.ui.domain.repositories

import com.example.crocusoft_project1.ui.domain.StoryEntity

interface HomeRepository {

    fun fetchStories(): List<StoryEntity>
}