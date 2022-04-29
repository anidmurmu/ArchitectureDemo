package com.example.architecturedemo.domain.usecase.university

import com.example.architecturedemo.domain.model.university.UniversityUiModel
import com.example.architecturedemo.domain.repository.university.UniversityRepository
import javax.inject.Inject

interface GetUniversityListUseCase {
    suspend fun getUniversityList(country: String): Result<List<UniversityUiModel>>
}

class GetUniversityListUseCaseImpl @Inject constructor(
    private val universityRepository: UniversityRepository
)
    : GetUniversityListUseCase {
    override suspend fun getUniversityList(country: String): Result<List<UniversityUiModel>> {
        return universityRepository.getUniversityList(country)
    }
}