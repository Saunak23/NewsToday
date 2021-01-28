package com.example.newstoday




data class News {
    var title: String = "default value"
        get() =  field

        set(value) {
        field = value,
    }

    var author: String = "default value"
        get() =  field

        set(value) {
            field = value,
        }

    var url: String = "default value"
    get() =  field

    set(value) {
        field = value,
    }


    var imageUrl: String = "default value"
        get() =  field

        set(value) {
            field = value,
        }



}