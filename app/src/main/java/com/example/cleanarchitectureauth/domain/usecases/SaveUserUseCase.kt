package com.example.cleanarchitectureauth.domain.usecases

import com.example.cleanarchitectureauth.domain.repositories.UserRepository
import javax.inject.Inject

class SaveUserUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(username: String, name: String, surname: String, age: Int, password: String) =
        repository.saveUser(username, name, surname, age, password)
}