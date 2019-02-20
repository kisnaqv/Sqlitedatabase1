package com.example.sqlitedatabase1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dBase:SQLiteDatabase=openOrCreateDatabase("registration",Context.MODE_PRIVATE,null)
        dBase.execSQL("create table if not exists employee(_id integer primary key autoincrement,name varchar(50),email varchar(50),mobilenumber integer(10),gender varchar(6)  )")




        btninsert.setOnClickListener {  }
        btnread.setOnClickListener {  }
        btnupdate.setOnClickListener {  }
        btndelete.setOnClickListener {  }
    }
}
