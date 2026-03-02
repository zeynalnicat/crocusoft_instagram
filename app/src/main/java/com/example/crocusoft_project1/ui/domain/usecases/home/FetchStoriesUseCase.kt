package com.example.crocusoft_project1.ui.domain.usecases.home

import com.example.crocusoft_project1.ui.domain.entities.StoryEntity
import com.example.crocusoft_project1.ui.domain.repositories.HomeRepository

class FetchStoriesUseCase(
    private val homeRepository: HomeRepository
) {
    operator fun invoke(): List<StoryEntity> {
        return homeRepository.fetchStories()
    }
}