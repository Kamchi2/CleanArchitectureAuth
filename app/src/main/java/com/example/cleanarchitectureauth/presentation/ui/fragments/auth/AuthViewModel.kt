package com.example.cleanarchitectureauth.presentation.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureauth.domain.usecases.SaveUserUseCase
import com.example.cleanarchitectureauth.domain.usecases.SetAuthtorizedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val saveUserUseCase: SaveUserUseCase,
    private val setIsAuthtorizedUseCase: SetAuthtorizedUseCase
) : ViewModel() {

    fun saveUser(name: String, surname: String, age: Int, username: String, password: String) {
        saveUserUseCase(username, name, surname, age, password)
    }

    fun setIsAuthorized(boolean: Boolean) {
        setIsAuthtorizedUseCase(boolean)
    }
}