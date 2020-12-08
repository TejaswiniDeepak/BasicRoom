package com.example.basicroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "newtable")
data class Data(
    @PrimaryKey(autoGenerate = true)
    val nightId: Int,
@ColumnInfo(name = "firstname") val firstname:String

    )