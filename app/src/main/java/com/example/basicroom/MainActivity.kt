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
            //val db:AppDatabase= AppDatabase.getInstance(this)
            GlobalScope.launch {

               /**var rowNumber= db.wordDao().deleteAll()
                Log.i("Deleted Row","$rowNumber")**/

               callDatabase(inputtext1.text.toString().toInt(),inputtext.text.toString())
                display()
            }
        }
    }
    private fun callDatabase(did:Int,dname:String)
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
var data1=Data(nightId = did,firstname =dname)
        //val data2=Data(name = "teju")
        db.wordDao().insertData(data1)
        //db.wordDao().insertData(data2)


       // db.wordDao().insertData(data)

    }
    private fun display()
    {
        val db:AppDatabase= AppDatabase.getInstance(this)
     val displaydata=db.wordDao().displayData()
        var i=0
        var numberOfRecords=displaydata.count()
        while (i<=numberOfRecords-1) {

            Log.i("id", "${displaydata[i].nightId}")
            Log.i("id", "${displaydata[i].firstname}")
            i++
        }
        /**val displaydata2=db.wordDao().displayData()
        Log.i("id","${displaydata2.nightId}")
        Log.i("id","${displaydata2.name}")**/

       // Log.i("name","${displaydata.name}")
    }
}