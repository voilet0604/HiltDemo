package com.violet.model

import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: IUserRepository
) {
    suspend operator fun invoke(name: String, pwd: String): UserModel {
        val userModel = repository.login(name, pwd)
        repository.saveUser(userModel)
        return userModel
    }
}