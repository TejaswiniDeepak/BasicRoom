package com.example.basicroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            GlobalScope.launch {
                callDatabase()
                display()
            }
        }
    }
    private fun callDatabase()
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
val data=Data()
        db.wordDao().insertData(data)

       // db.wordDao().insertData(data)

    }
    private fun display()
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
     val displaydata=db.wordDao().displayData()
        Log.i("id","${displaydata.nightId}")
       // Log.i("name","${displaydata.name}")
    }
}