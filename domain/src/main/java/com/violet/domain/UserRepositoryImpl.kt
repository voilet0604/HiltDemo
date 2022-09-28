package com.violet.domain

import com.violet.model.ILocalUserDataSource
import com.violet.model.IRemoteUserDataSource
import com.violet.model.IUserRepository
import com.violet.model.UserModel
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val localUserDataSource: ILocalUserDataSource,
    private val remoteUserDataSource: IRemoteUserDataSource
): IUserRepository {

    override suspend fun login(name: String, pwd: String): UserModel {
        return remoteUserDataSource.login(name, pwd)
    }

    override suspend fun saveUser(user: UserModel): Boolean {
        return localUserDataSource.saveUser(user)
    }


}