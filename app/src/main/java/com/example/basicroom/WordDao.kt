package com.example.basicroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {
    @Insert
    fun insertData(value:Word)
    @Query("SELECT *FROM WORDTABLE")
    fun displayData():Word
}