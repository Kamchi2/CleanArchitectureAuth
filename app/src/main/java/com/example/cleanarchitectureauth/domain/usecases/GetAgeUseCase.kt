package com.example.cleanarchitectureauth.domain.usecases

import com.example.cleanarchitectureauth.domain.repositories.UserRepository
import javax.inject.Inject

class GetAgeUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke() = repository.getAge()
}