package com.example.architecturedemo.domain.mapper

interface Mapper<R, D> {
    fun mapFrom(inputModel: R): D
}