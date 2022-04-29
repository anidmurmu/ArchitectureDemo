package com.example.architecturedemo.data.mapper.university

import com.example.architecturedemo.data.entity.university.UniversityNetworkModel
import com.example.architecturedemo.domain.mapper.Mapper
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import javax.inject.Inject

class NetworkToUiUniversityMapper @Inject constructor()
    : Mapper<Result<List<UniversityNetworkModel>>, Result<List<UniversityUiModel>>> {
    override fun mapFrom(inputModel: Result<List<UniversityNetworkModel>>): Result<List<UniversityUiModel>> {

        return inputModel.fold(
            onFailure = {
                Result.failure(it)
            },
            onSuccess = {
                Result.success(mapToUiModel(it))
            }
        )
    }

    private fun mapToUiModel(list: List<UniversityNetworkModel>): List<UniversityUiModel> {
        return list.map {
            UniversityUiModel(
                it.country,
                it.name,
                it.webPages,
                it.domains,
                it.alphaTwoCode
            )
        }
    }
}