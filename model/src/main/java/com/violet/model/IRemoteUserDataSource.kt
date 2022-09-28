package com.violet.model

interface IRemoteUserDataSource {

    suspend fun login(name: String, pwd: String): UserModel

}