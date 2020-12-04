package com.example.basicroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
GlobalScope.launch {
    callDatabase()
    display()
}
    }
    fun callDatabase()
    {
        var db:AppDatabase= AppDatabase.getInstance(this)
    var data=Word(1,"Teju")

        db.wordDao().insertData(data)

    }
    fun display()
    {
        var db:AppDatabase= AppDatabase.getInstance(this)
     var displaydata=db.wordDao().displayData()
        Log.i("id","${displaydata.id}")
        Log.i("name","${displaydata.name}")
    }
}