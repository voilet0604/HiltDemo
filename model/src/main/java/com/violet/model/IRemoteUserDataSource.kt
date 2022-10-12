package com.violet.model

import com.violet.model.entity.User

interface IRemoteUserDataSource {

    suspend fun login(name: String, pwd: String): User

}