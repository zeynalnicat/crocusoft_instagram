package com.example.crocusoft_project1.ui.presentation.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.crocusoft_project1.ui.domain.StoryEntity
import com.example.crocusoft_project1.ui.domain.usecases.home.FetchStoriesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val fetchStoriesUseCase: FetchStoriesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(HomeContract.State())

    val state = _state.asStateFlow()


    fun onIntent(intent: HomeContract.Intent) {
        when (intent) {
            is HomeContract.Intent.OnFetchStories -> {
                onFetchStories()
            }
        }

    }

    private fun onFetchStories() {

        viewModelScope.launch {
            _state.emit(_state.value.copy(stories = fetchStoriesUseCase()))

        }


    }

}