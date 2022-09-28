package com.violet.hilt

import android.app.Application
import androidx.lifecycle.ViewModel
import com.violet.model.LoginUseCase
import com.violet.model.UserModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val application: Application,
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    suspend fun login(name: String, pwd: String): UserModel = loginUseCase(name, pwd)
}