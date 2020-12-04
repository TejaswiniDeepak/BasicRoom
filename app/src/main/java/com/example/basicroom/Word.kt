package com.example.basicroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wordTable")
data class Word(
    @PrimaryKey(autoGenerate = true) var id:Int?=null,
    @ColumnInfo var name:String=""
) {
}