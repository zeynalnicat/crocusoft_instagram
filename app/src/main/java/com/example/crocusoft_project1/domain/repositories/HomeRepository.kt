package com.example.crocusoft_project1.domain.repositories

import com.example.crocusoft_project1.domain.entities.StoryEntity

interface HomeRepository {

    fun fetchStories(): List<StoryEntity>
}