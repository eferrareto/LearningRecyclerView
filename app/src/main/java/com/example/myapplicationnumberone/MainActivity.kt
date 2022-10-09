package com.example.myapplicationnumberone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationnumberone.model.Categoria

class MainActivity : AppCompatActivity() {

    private lateinit var rcView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lista = mutableListOf<Categoria>()

        rcView = findViewById(R.id.rcView)
        rcView.adapter = MainAdapter(lista)
        rcView.layoutManager = LinearLayoutManager(this)

        lista.add(
            Categoria("My Number", "1199954285")
        )
        lista.add(
            Categoria("Number my Gilfriend", "1199954285")
        )
        lista.add(
            Categoria("Number my Brother", "1199954285")
        )
        lista.add(
            Categoria("Number my Mother", "1199954285")
        )
        lista.add(
            Categoria("Number my Father", "1199954285")
        )
        lista.add(
            Categoria("My Number", "1199954285")
        )
        lista.add(
            Categoria("Number my Gilfriend", "1199954285")
        )
        lista.add(
            Categoria("My Number", "1199954285")
        )
        lista.add(
            Categoria("Number my Gilfriend", "1199954285")
        )
        lista.add(
            Categoria("Number my Brother", "1199954285")
        )
        lista.add(
            Categoria("Number my Mother", "1199954285")
        )
        lista.add(
            Categoria("Number my Father", "1199954285")
        )
        lista.add(
            Categoria("Number my Brother", "1199954285")
        )
        lista.add(
            Categoria("Number my Mother", "1199954285")
        )
        lista.add(
            Categoria("Number my Father", "1199954285")
        )
        lista.add(
            Categoria("Number my Brother", "1199954285")
        )
        lista.add(
            Categoria("Number my Mother", "1199954285")
        )
        lista.add(
            Categoria("Number my Father", "1199954285")
        )
        lista.add(
            Categoria("Number my Brother", "1199954285")
        )
        lista.add(
            Categoria("Number my Mother", "1199954285")
        )
        lista.add(
            Categoria("Number my Father", "1199954285")
        )




    }
    private inner class MainAdapter(var lista : MutableList<Categoria>) : RecyclerView.Adapter<MainViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = layoutInflater.inflate(R.layout.layout_rv, parent, false)
            return MainViewHolder(view)
        }

        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            val itemCurrent = lista[position]
            holder.bind(itemCurrent)
        }

        override fun getItemCount(): Int {
           return lista.size
        }

    }
    private inner class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(item:Categoria){
            val text : TextView = itemView.findViewById(R.id.txtTitle)
            val textName : TextView = itemView.findViewById(R.id.txtName)
            textName.text = item.name
            text.text = item.title
        }
    }
}