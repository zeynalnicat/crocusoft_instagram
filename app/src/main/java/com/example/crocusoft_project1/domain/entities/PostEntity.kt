package com.example.crocusoft_project1.domain.entities

data class PostEntity(
    val username: String,
    val userUri: String,
    val contents: List<String>,
    val location: String,
    val description: String,
    val date: String,
) {
    companion object {
        fun mockData(): PostEntity = PostEntity(
            username = "zeynalnicat",
            contents = listOf("https://picsum.photos/200/300"),
            location = "Baku, Azerbaijan",
            description = "A beautiful sunset over the mountains in Azerbaijan. Follow me to stay tuned with latest updates ",
            date = "14 December",
            userUri = "https://i.pinimg.com/236x/07/01/66/070166623e835c5421388e5278ca8c9a.jpg"
        )
    }

}
