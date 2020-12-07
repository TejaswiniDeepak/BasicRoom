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
                callDatabase(inputtext.text.toString())
                display()
            }
        }
    }
    private fun callDatabase(dname:String)
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
var data1=Data(name = dname)
        //val data2=Data(name = "teju")
        db.wordDao().insertData(data1)
        //db.wordDao().insertData(data2)


       // db.wordDao().insertData(data)

    }
    private fun display()
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
     val displaydata=db.wordDao().displayData()
        Log.i("id","${displaydata.nightId}")
        Log.i("id","${displaydata.name}")

        val displaydata2=db.wordDao().displayData()
        Log.i("id","${displaydata2.nightId}")
        Log.i("id","${displaydata2.name}")

       // Log.i("name","${displaydata.name}")
    }
}