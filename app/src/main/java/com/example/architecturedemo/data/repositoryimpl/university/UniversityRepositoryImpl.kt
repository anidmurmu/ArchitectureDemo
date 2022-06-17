package com.example.architecturedemo.data.repositoryimpl.university

import android.util.Log
import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.example.architecturedemo.data.mapper.university.NetworkToUiUniversityMapper
import com.example.architecturedemo.data.source.network.retrofit.university.UniversityService
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import com.example.architecturedemo.domain.repository.university.UniversityRepository
import java.lang.Exception
import javax.inject.Inject

class UniversityRepositoryImpl @Inject constructor(
    private val universityService: UniversityService,
    private val networkToUiUniversityMapper: NetworkToUiUniversityMapper
)
    : UniversityRepository {
    override suspend fun getUniversityList(country: String): Either<Throwable, List<UniversityUiModel>> {
        val result = try {
            val universityList = universityService.getUniversityList(country)
            Log.d("apple1", universityList.toString())
            //Result.success(universityList)
            Either.Right(universityList)
        } catch (ex: Exception) {
            //Result.failure(ex)
            Log.d("apple1", ex.toString())
            Either.Left(ex)
        }
        return networkToUiUniversityMapper.mapFrom(result)
    }
}