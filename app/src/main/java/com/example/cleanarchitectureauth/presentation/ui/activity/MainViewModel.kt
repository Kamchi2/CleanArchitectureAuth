package com.example.cleanarchitectureauth.presentation.ui.activity

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureauth.domain.usecases.GetAuthtorizedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getIsAuthtorizedUseCase: GetAuthtorizedUseCase
) : ViewModel() {

    fun getIsAuthtorized() = getIsAuthtorizedUseCase()

}