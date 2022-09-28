package com.violet.domain

import com.violet.model.ILocalUserDataSource
import com.violet.model.IRemoteUserDataSource
import com.violet.model.IUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    @Singleton
    abstract fun bindUserRepository(repository: UserRepositoryImpl): IUserRepository

    @Binds
    @Singleton
    abstract fun bindLocalUserDataSource(localUserDataSource: LocalUserDataSourceImpl): ILocalUserDataSource

    @Binds
    @Singleton
    abstract fun bindRemoteUserDataSource(remoteUserDataSourceImpl: RemoteUserDataSourceImpl): IRemoteUserDataSource
}