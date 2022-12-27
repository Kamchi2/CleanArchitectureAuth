package com.example.cleanarchitectureauth.presentation.ui.activity

import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureauth.domain.usecases.GetIsAuthtorizedUseCase
import com.example.cleanarchitectureauth.domain.usecases.SaveUserUseCase
import com.example.cleanarchitectureauth.domain.usecases.SetIsAuthtorizedUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getIsAuthtorizedUseCase: GetIsAuthtorizedUseCase
) : ViewModel() {

    fun getIsAuthtorized() = getIsAuthtorizedUseCase()

}