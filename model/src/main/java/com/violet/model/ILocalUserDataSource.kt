package com.violet.model

import com.violet.model.entity.User

interface ILocalUserDataSource {

    suspend fun saveUser(vararg user: User): Boolean

    suspend fun getUserList(): List<User>
}