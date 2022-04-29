package com.example.architecturedemo.domain.repository.university

import com.example.architecturedemo.domain.model.university.UniversityUiModel

interface UniversityRepository {
    suspend fun getUniversityList(country: String): Result<List<UniversityUiModel>>
}