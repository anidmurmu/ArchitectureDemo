package com.example.architecturedemo.data.source.network.retrofit.university.di

import com.example.architecturedemo.data.source.network.retrofit.university.UniversityService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import retrofit2.Retrofit

@Module
@InstallIn(ActivityRetainedComponent::class)
class UniversityServiceModule {

    @Provides
    @ActivityRetainedScoped
    fun provideUniversityService(
        retrofit: Retrofit
    ): UniversityService {
        return retrofit.create(UniversityService::class.java)
    }
}