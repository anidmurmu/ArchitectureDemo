package com.example.architecturedemo.data.mapper.university

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.example.architecturedemo.data.entity.university.UniversityNetworkModel
import com.example.architecturedemo.domain.mapper.Mapper
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import java.lang.Exception
import javax.inject.Inject

class NetworkToUiUniversityMapper @Inject constructor()
    : Mapper<Either<Exception, List<UniversityNetworkModel>>, Either<Exception, List<UniversityUiModel>>> {
    override fun mapFrom(inputModel: Either<Exception, List<UniversityNetworkModel>>): Either<Exception, List<UniversityUiModel>> {
        return when(inputModel) {
            Either.Right -> {
                Either.Right(mapToUiModel(inputModel.right()))
            }
            Either.Left -> {
                Either.Left(inputModel.left())
            }
        }
    }

    private fun mapToUiModel(list: List<UniversityNetworkModel>): List<UniversityUiModel> {
        list.map {
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