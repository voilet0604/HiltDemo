package com.violet.model

import com.violet.model.entity.User

interface IUserRepository {

    suspend fun login(name: String, pwd: String): User

    suspend fun saveUser(vararg user: User): Boolean

    suspend fun getUserList(): List<User>
}