package com.violet.domain

import com.violet.model.ILocalUserDataSource
import com.violet.model.UserModel
import javax.inject.Inject

class LocalUserDataSourceImpl @Inject constructor(): ILocalUserDataSource {

    override suspend fun saveUser(user: UserModel): Boolean {
        return true
    }
}