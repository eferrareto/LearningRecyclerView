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


        val categoria1 = Categoria(title = "My name", name = "Erick")

        lista.add(categoria1)




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
        fun bind(item: Categoria){

            val txtTitle : TextView = findViewById(R.id.txtTitle)
            val txtText : TextView = findViewById(R.id.txtText)
            txtTitle.text = item.title
        }
    }
}