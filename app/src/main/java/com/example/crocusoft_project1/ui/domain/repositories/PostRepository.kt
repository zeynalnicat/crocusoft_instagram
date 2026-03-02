package com.example.crocusoft_project1.ui.domain.repositories

import com.example.crocusoft_project1.ui.domain.entities.PostEntity

interface PostRepository {

    fun fetchPosts(): List<PostEntity>
}