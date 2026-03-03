package com.example.crocusoft_project1.presentation.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.crocusoft_project1.data.HomeRepositoryImpl
import com.example.crocusoft_project1.data.PostRepositoryImpl
import com.example.crocusoft_project1.domain.repositories.HomeRepository
import com.example.crocusoft_project1.domain.repositories.PostRepository
import com.example.crocusoft_project1.domain.usecases.home.FetchStoriesUseCase
import com.example.crocusoft_project1.domain.usecases.post.FetchPostsUseCase


@Composable
fun HomeView(innerPadding: PaddingValues, viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    HomeContent(
        innerPadding = innerPadding,
        state = state,
        postIntent = viewModel::onIntent
    )
}

