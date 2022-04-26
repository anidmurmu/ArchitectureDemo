package com.example.architecturedemo.domain.repository.university

import arrow.core.Either
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import java.lang.Exception

interface UniversityRepository {
    suspend fun getUniversityList(country: String): Either<Exception, List<UniversityUiModel>>
}