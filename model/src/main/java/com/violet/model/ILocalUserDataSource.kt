package com.violet.model

interface ILocalUserDataSource {

    suspend fun saveUser(user: UserModel): Boolean

}