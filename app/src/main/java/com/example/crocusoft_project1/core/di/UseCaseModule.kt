package com.example.crocusoft_project1.core.di

import com.example.crocusoft_project1.domain.repositories.HomeRepository
import com.example.crocusoft_project1.domain.repositories.PostRepository
import com.example.crocusoft_project1.domain.usecases.home.FetchStoriesUseCase
import com.example.crocusoft_project1.domain.usecases.post.FetchPostsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideFetchStoriesUseCase(repository: HomeRepository): FetchStoriesUseCase =
        FetchStoriesUseCase(repository)

    @Provides
    @Singleton
    fun provideFetchPostUseCase(repository: PostRepository): FetchPostsUseCase =
        FetchPostsUseCase(repository)

}