package com.example.architecturedemo.domain.usecase.university.di

import com.example.architecturedemo.domain.repository.university.UniversityRepository
import com.example.architecturedemo.domain.usecase.university.GetUniversityListUseCase
import com.example.architecturedemo.domain.usecase.university.GetUniversityListUseCaseImpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class UniversityModule {

        @Provides
        @ActivityRetainedScoped
        fun provideGetUniversityListUseCase(
            universityRepository: UniversityRepository
        ): GetUniversityListUseCase {
            return GetUniversityListUseCaseImpl(universityRepository)
        }
}