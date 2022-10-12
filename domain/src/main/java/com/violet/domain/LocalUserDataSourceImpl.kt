package com.violet.domain

import com.violet.domain.dp.dao.UserDao
import com.violet.model.ILocalUserDataSource
import com.violet.model.entity.User
import javax.inject.Inject

class LocalUserDataSourceImpl @Inject constructor(private val userDao: UserDao): ILocalUserDataSource {

    override suspend fun saveUser(vararg users: User): Boolean {
        userDao.insertAll(*users)
        return true
    }

    override suspend fun getUserList(): List<User> {
        return userDao.getAll()
    }

}