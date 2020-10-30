package com.example.belajarrecycleviewlatihan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

val list = ArrayList<Users>()
val listUsers = arrayOf(
    "Alpha",
    "Bravo",
    "Charlie",
    "Delta",
    "Echo",
    "Foxtrot",
    "Golf",
    "Hotel",
    "India",
    "Juliet")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.setHasFixedSize(true)
        rv.layoutManager= LinearLayoutManager(this)
        for (i in listUsers.indices){
            list.add(Users(listUsers.get(i)))
            if(listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                rv.adapter = adapter
            }
        }
    }
}