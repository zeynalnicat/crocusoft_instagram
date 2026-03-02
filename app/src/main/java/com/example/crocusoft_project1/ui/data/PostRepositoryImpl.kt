package com.example.crocusoft_project1.ui.data

import com.example.crocusoft_project1.ui.domain.entities.PostEntity
import com.example.crocusoft_project1.ui.domain.repositories.PostRepository


class PostRepositoryImpl: PostRepository {



    override fun fetchPosts(): List<PostEntity> {
        return (18..35).map {
            PostEntity(
               username =  it.toString(),
                contents = listOf("https://picsum.photos/id/18/200/300"),
                location = "Baku, Azerbaijan",
                description = "A beautiful sunset over the mountains in Azerbaijan. Follow me to stay tuned with latest updates ",
                date = "14 December",
                userUri = "https://mockimage.tw/photo/320x240/ffffff/000000/$it"
            )
        }
    }
}