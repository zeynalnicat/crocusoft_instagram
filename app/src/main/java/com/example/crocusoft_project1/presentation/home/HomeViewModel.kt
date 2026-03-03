package com.example.crocusoft_project1.presentation.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.crocusoft_project1.domain.entities.PostEntity
import com.example.crocusoft_project1.domain.usecases.home.FetchStoriesUseCase
import com.example.crocusoft_project1.domain.usecases.post.FetchPostsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val fetchStoriesUseCase: FetchStoriesUseCase,
    private val fetchPostsUseCase: FetchPostsUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(HomeContract.State())

    val state = _state.asStateFlow()

    fun onIntent(intent: HomeContract.Intent) {
        when (intent) {
            HomeContract.Intent.OnFetchStories -> {
                onFetchStories()
            }

            HomeContract.Intent.OnToggleMore -> {}
            HomeContract.Intent.OnComment -> {}
            is HomeContract.Intent.OnLikePost -> {
                likePost(intent.postEntity)
            }

            is HomeContract.Intent.OnSave -> {}
            is HomeContract.Intent.OnShare -> {}
            HomeContract.Intent.OnFetchPosts -> {
                onFetchPosts()
            }

            HomeContract.Intent.OnLoadMore -> {
                loadMore()
            }

            HomeContract.Intent.OnPrefixAction -> {}
            HomeContract.Intent.OnSuffixLeftAction -> {}
            HomeContract.Intent.OnSuffixRightAction -> {}
        }

    }

    private fun likePost(post: PostEntity) {

        if (_state.value.likedPosts.contains(post)) {
            viewModelScope.launch {
                _state.emit(_state.value.copy(likedPosts = _state.value.likedPosts - post))
            }
        } else {
            viewModelScope.launch {
                _state.emit(_state.value.copy(likedPosts = _state.value.likedPosts + post))

            }
        }

    }


    private fun loadMore() {
        viewModelScope.launch {
            _state.emit(_state.value.copy(page = _state.value.page + 1))

        }

    }

    private fun onFetchPosts() {
        viewModelScope.launch {
            _state.emit(
                _state.value.copy(
                    posts = _state.value.posts + fetchPostsUseCase(
                        state.value.page,
                        state.value.size
                    )
                )
            )
        }
    }

    private fun onFetchStories() {
        viewModelScope.launch {
            _state.emit(_state.value.copy(stories = fetchStoriesUseCase()))

        }

    }

}