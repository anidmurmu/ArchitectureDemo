package com.example.architecturedemo.domain.repository.university

import arrow.core.Either
import com.example.architecturedemo.domain.model.university.UniversityUiModel

interface UniversityRepository {
    suspend fun getUniversityList(country: String): Either<Throwable, List<UniversityUiModel>>
}