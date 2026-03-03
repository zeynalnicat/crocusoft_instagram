package com.example.crocusoft_project1.core.di

import com.example.crocusoft_project1.data.HomeRepositoryImpl
import com.example.crocusoft_project1.data.PostRepositoryImpl
import com.example.crocusoft_project1.domain.repositories.HomeRepository
import com.example.crocusoft_project1.domain.repositories.PostRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideHomeRepository(): HomeRepository = HomeRepositoryImpl()

    @Singleton
    @Provides
    fun providePostRepository(): PostRepository = PostRepositoryImpl()
}