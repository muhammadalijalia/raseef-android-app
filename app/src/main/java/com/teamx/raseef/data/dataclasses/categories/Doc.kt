package com.teamx.raseef.dataclasses.categories

import androidx.annotation.Keep


@Keep
data class Doc(
    val __v: Int,
    val _id: String,
    val children: List<Any>,
    val createdAt: String,
    val details: String,
    val icon: String,
    val name: String,
    val products: List<Any>,
    val slug: String,
    val type: Type,
    val updatedAt: String
)