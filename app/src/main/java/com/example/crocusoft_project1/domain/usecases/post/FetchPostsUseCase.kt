package com.example.crocusoft_project1.domain.usecases.post

import com.example.crocusoft_project1.domain.entities.PostEntity
import com.example.crocusoft_project1.domain.repositories.PostRepository
import javax.inject.Inject


class FetchPostsUseCase @Inject constructor(
    private val postRepository: PostRepository

) {

    operator fun invoke(page: Int, size: Int): List<PostEntity> {
        return postRepository.fetchPosts(page, size)

    }
}