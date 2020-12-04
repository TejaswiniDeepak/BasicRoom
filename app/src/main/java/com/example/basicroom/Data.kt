package com.example.basicroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "newtable")
data class Data(
    @PrimaryKey(autoGenerate = true)
    var nightId: Int=0,
    //@ColumnInfo(name="word")
//var name:String=""

    )