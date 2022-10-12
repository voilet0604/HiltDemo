package com.violet.domain.dp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.violet.domain.dp.dao.UserDao
import com.violet.model.entity.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    companion object {
        fun initDb(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "xxx_dp").allowMainThreadQueries().build()
        }
    }

    abstract fun userDao(): UserDao
}