package com.example.architecturedemo.data.mapper.university

import arrow.core.*
import com.example.architecturedemo.data.entity.university.UniversityNetworkModel
import com.example.architecturedemo.domain.mapper.Mapper
import com.example.architecturedemo.domain.model.university.UniversityUiModel
import javax.inject.Inject

class NetworkToUiUniversityMapper @Inject constructor()
    : Mapper<Either<Throwable, List<UniversityNetworkModel>>, Either<Throwable, List<UniversityUiModel>>> {
    override fun mapFrom(inputModel: Either<Throwable, List<UniversityNetworkModel>>): Either<Throwable, List<UniversityUiModel>> {

        /*return inputModel.fold(
            onFailure = {
                //it
                //Result.failure(it)
                Result.failure(Throwable())
            },
            onSuccess = {
                //Result.success(mapToUiModel(it))
                //mapToUiModel(it))
                Result.success(emptyList<UniversityUiModel>())
            }
        )*/


        return inputModel.fold(
            ifLeft = {
                Either.Left(it)
            },
            ifRight = {
                Either.Right(mapToUiModel(it))
            }
        )

        /*return if (inputModel.isLeft()) {
            inputModel.left().flatten()
        } else {
            Either.right(mapToUiModel(inputModel.right().flatten()))
        }*/


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