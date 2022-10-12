package com.violet.model

import com.violet.model.entity.User
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: IUserRepository
) {
    suspend operator fun invoke(name: String, pwd: String): User {
        val userModel = repository.login(name, pwd)
        repository.saveUser(userModel)
        return userModel
    }
}