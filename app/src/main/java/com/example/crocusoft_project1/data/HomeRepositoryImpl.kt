package com.example.crocusoft_project1.data

import com.example.crocusoft_project1.domain.entities.StoryEntity
import com.example.crocusoft_project1.domain.repositories.HomeRepository

class HomeRepositoryImpl: HomeRepository {
    override fun fetchStories(): List<StoryEntity> {
        return (1..10).map { id ->
            StoryEntity(
                imgUri = "https://picsum.photos/id/${id}/200/300",
                name = "Jane $id",
                isLive = id % 4 == 0
            )
        }
    }
}