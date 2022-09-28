package com.violet.domain

import com.violet.model.IRemoteUserDataSource
import com.violet.model.UserModel
import javax.inject.Inject

class RemoteUserDataSourceImpl @Inject constructor(): IRemoteUserDataSource {

    override suspend fun login(name: String, pwd: String): UserModel {
        return UserModel(System.currentTimeMillis().toString(), name, name)
    }

}