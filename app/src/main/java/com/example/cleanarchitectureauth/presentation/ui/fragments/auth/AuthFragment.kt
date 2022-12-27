package com.example.cleanarchitectureauth.presentation.ui.fragments.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cleanarchitectureauth.R
import com.example.cleanarchitectureauth.databinding.FragmentAuthBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment: Fragment(R.layout.fragment_auth) {

    val binding by viewBinding(FragmentAuthBinding::bind)
    val viewModel: AuthViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        registerConfirmBtn.setOnClickListener {
            if(!passwordEt.text.toString().equals(passwordConfirmEt.text.toString())) {
                passwordEt.error = "Пароли не совпадают"
            } else {
                viewModel.saveUser(
                    nameEt.text.toString(),
                    surnameEt.text.toString(),
                    ageEt.text.toString().toInt(),
                    usernameEt.text.toString(),
                    passwordEt.text.toString()
                    )
                viewModel.setIsAuthorized(true)
                findNavController().navigate(
                    AuthFragmentDirections.actionAuthFragmentToHomeFragment()
                )
            }
        }
    }
}