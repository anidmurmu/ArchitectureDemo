package com.example.architecturedemo.domain.model.university

data class UniversityUiModel(
    val country: String,
    val name: String,
    val webPageList: List<String>,
    val domainList: List<String>,
    val alphaTwoCode: String
)