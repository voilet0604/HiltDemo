package com.violet.domain

import com.violet.model.ILocalUserDataSource
import com.violet.model.IRemoteUserDataSource
import com.violet.model.IUserRepository
import com.violet.model.entity.User
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val localUserDataSource: ILocalUserDataSource,
    private val remoteUserDataSource: IRemoteUserDataSource
): IUserRepository {

    override suspend fun login(name: String, pwd: String): User {
        return remoteUserDataSource.login(name, pwd)
    }

    override suspend fun saveUser(vararg user: User): Boolean {
        return localUserDataSource.saveUser(*user)
    }

    override suspend fun getUserList(): List<User> {
        return localUserDataSource.getUserList()
    }
}