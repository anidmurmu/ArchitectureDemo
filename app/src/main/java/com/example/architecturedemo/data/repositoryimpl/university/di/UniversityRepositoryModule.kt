package com.example.architecturedemo.data.repositoryimpl.university.di

import com.example.architecturedemo.data.mapper.university.NetworkToUiUniversityMapper
import com.example.architecturedemo.data.repositoryimpl.university.UniversityRepositoryImpl
import com.example.architecturedemo.data.source.network.retrofit.university.UniversityService
import com.example.architecturedemo.domain.repository.university.UniversityRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class UniversityRepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideUniversityRepository(
        universityService: UniversityService,
        networkToUiUniversityMapper: NetworkToUiUniversityMapper
    ): UniversityRepository {
        return UniversityRepositoryImpl(
            universityService,
            networkToUiUniversityMapper
        )
    }
}