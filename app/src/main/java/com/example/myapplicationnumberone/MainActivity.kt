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
            Categoria(
                title = "Olá Mundo",
                name = "Erick Ferrareto"
            )
        )
        lista.add(
            Categoria(
                title = "My World",
                name = "Tayna Nogueira"
            )
        )
        lista.add(
            Categoria(
                title = "My Brother",
                name = "Pedro Henrique"
            )
        )
        lista.add(
            Categoria(
                title = "My Mother",
                name = "Alessandra Ferrareto"
            )
        )
        lista.add(
            Categoria(
                title = "My father",
                name = "Haroldo Ferrareto"
            )
        )
        lista.add(
            Categoria(
                title = "My Grandmother",
                name = "Neide Souza"
            )
        )
        lista.add(
            Categoria(
                title = "My Grandfather",
                name = "Valdemar Pereira"
            )
        )




    }
    private inner class MainAdapter(var lista : List<Categoria>) : RecyclerView.Adapter<MainViewHolder>(){
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
        fun bind(item: Categoria){

            val txtTitle : TextView = findViewById(R.id.txtTitle)
            txtTitle.text = item.title
        }
    }
}