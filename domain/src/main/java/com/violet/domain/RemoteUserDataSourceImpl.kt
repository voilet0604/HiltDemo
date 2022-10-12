package com.violet.domain

import com.violet.model.IRemoteUserDataSource
import com.violet.model.entity.User
import javax.inject.Inject

class RemoteUserDataSourceImpl @Inject constructor(): IRemoteUserDataSource {

    override suspend fun login(name: String, pwd: String): User {
        return User(2, name, name)
    }

}