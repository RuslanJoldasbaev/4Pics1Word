package com.example.a4suwret1manis.data

import androidx.annotation.DrawableRes

data class Question(
    val id:Int,
    @DrawableRes val images: List<Int>,
    val answer:String
)
