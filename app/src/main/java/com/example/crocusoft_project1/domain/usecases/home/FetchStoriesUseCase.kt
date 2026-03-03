package com.example.crocusoft_project1.domain.usecases.home

import com.example.crocusoft_project1.domain.entities.StoryEntity
import com.example.crocusoft_project1.domain.repositories.HomeRepository
import javax.inject.Inject

class FetchStoriesUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {
    operator fun invoke(): List<StoryEntity> {
        return homeRepository.fetchStories()
    }
}