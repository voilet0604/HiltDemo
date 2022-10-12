package com.violet.model.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(indices = [Index(value = ["id"], unique = true)])
data class User(
    val id: Int = 0,
    val name: String = "",
    val pwd: String ="",
    @PrimaryKey(autoGenerate = true)
    val time: Long = 0
)