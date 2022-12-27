package com.example.cleanarchitectureauth.domain.usecases

import com.example.cleanarchitectureauth.domain.repositories.UserRepository
import javax.inject.Inject

class GetUsernameUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke() = repository.getUserName()
}