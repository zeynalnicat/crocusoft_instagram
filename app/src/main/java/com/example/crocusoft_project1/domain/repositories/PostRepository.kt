package com.example.crocusoft_project1.domain.repositories

import com.example.crocusoft_project1.domain.entities.PostEntity

interface PostRepository {

    fun fetchPosts(page:Int,size:Int): List<PostEntity>
}