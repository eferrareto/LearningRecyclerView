package com.example.myapplicationnumberone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycler :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler = findViewById(R.id.rcview)
        var adapter = MainAdapter()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)


    }
    private inner class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            var view = layoutInflater.inflate(R.layout.layout_rv, parent,false)
            var viewHolder = MainViewHolder(view)
            return viewHolder
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        }

        override fun getItemCount(): Int {
            return 30
        }
    }


    private class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}