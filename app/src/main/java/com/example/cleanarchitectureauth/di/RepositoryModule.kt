package com.example.cleanarchitectureauth.di

import com.example.cleanarchitectureauth.data.repositories.UserRepositoryImpl
import com.example.cleanarchitectureauth.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindUserRepository(repositoryImpl: UserRepositoryImpl): UserRepository
}