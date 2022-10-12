package com.violet.hilt

import androidx.lifecycle.ViewModel
import com.violet.model.LoginUseCase
import com.violet.model.entity.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {
    suspend fun login(name: String, pwd: String): User = loginUseCase(name, pwd)
}