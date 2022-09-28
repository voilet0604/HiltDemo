package com.violet.model

interface IUserRepository {

    suspend fun login(name: String, pwd: String): UserModel

    suspend fun saveUser(user: UserModel): Boolean
}