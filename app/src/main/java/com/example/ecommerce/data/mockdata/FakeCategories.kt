package com.example.ecommerce.data.mockdata

import com.example.ecommerce.data.models.response.category.CategoryModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class FakeCategories {
    companion object {

        private val responseStr = """
        [
            {
                "id": 1,
                "name": "Clothes",
                "image": "https://i.imgur.com/QkIa5tT.jpeg",
                "creationAt": "2024-02-28T02:48:01.000Z",
                "updatedAt": "2024-02-28T02:48:01.000Z"
            },
            {
                "id": 2,
                "name": "Electronics",
                "image": "https://i.imgur.com/ZANVnHE.jpeg",
                "creationAt": "2024-02-28T02:48:01.000Z",
                "updatedAt": "2024-02-28T02:48:01.000Z"
            },
            {
                "id": 3,
                "name": "Furniture",
                "image": "https://i.imgur.com/Qphac99.jpeg",
                "creationAt": "2024-02-28T02:48:01.000Z",
                "updatedAt": "2024-02-28T02:48:01.000Z"
            },
            {
                "id": 4,
                "name": "Shoes",
                "image": "https://i.imgur.com/qNOjJje.jpeg",
                "creationAt": "2024-02-28T02:48:01.000Z",
                "updatedAt": "2024-02-28T02:48:01.000Z"
            },
            {
                "id": 5,
                "name": "Miscellaneous",
                "image": "https://i.imgur.com/BG8J0Fj.jpg",
                "creationAt": "2024-02-28T02:48:01.000Z",
                "updatedAt": "2024-02-28T02:48:01.000Z"
            },
            {
                "id": 8,
                "name": "játékok",
                "image": "https://placeimg.com/640/480/any",
                "creationAt": "2024-02-28T07:09:48.000Z",
                "updatedAt": "2024-02-28T07:09:48.000Z"
            },
            {
                "id": 20,
                "name": "food",
                "image": "https://ar.pinterest.com/pin/811140582868496891/",
                "creationAt": "2024-02-28T08:23:09.000Z",
                "updatedAt": "2024-02-28T08:23:09.000Z"
            },
            {
                "id": 23,
                "name": "Demo",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:18:03.000Z",
                "updatedAt": "2024-02-28T09:18:03.000Z"
            },
            {
                "id": 24,
                "name": "Category 2",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:24:23.000Z",
                "updatedAt": "2024-02-28T09:24:23.000Z"
            },
            {
                "id": 25,
                "name": "Category 9",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:25:13.000Z",
                "updatedAt": "2024-02-28T09:25:13.000Z"
            },
            {
                "id": 26,
                "name": "Sports",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:51:06.000Z",
                "updatedAt": "2024-02-28T09:51:06.000Z"
            },
            {
                "id": 27,
                "name": "Shoes",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:51:20.000Z",
                "updatedAt": "2024-02-28T09:51:20.000Z"
            },
            {
                "id": 28,
                "name": "Jewelery",
                "image": "http://placeimg.com/640/480",
                "creationAt": "2024-02-28T09:51:22.000Z",
                "updatedAt": "2024-02-28T09:51:22.000Z"
            }
        ]
        
    """.trimIndent()
        fun getCategories(): List<CategoryModel> {
            val gson = Gson()
            val listTyp = object : TypeToken<List<CategoryModel?>?>() {}.type
            return gson.fromJson(responseStr, listTyp)
        }

    }


}