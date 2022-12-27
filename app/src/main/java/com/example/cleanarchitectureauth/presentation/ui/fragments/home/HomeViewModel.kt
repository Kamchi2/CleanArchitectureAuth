package com.example.cleanarchitectureauth.presentation.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureauth.domain.usecases.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getNameUseCase: GetNameUseCase,
    private val getSurnameUseCase: GetSurnameUseCase,
    private val getAgeUseCase: GetAgeUseCase,
    private val getUsernameUseCase: GetUsernameUseCase,
    private val getPasswordUseCase: GetPasswordUseCase
) : ViewModel() {

    fun getName() = getNameUseCase()

    fun getSurname() = getSurnameUseCase()

    fun getAge() = getAgeUseCase()

    fun getUsername() = getUsernameUseCase()

    fun getPassword() = getPasswordUseCase()
}