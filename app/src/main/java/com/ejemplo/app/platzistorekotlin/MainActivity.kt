package com.ejemplo.app.platzistorekotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewLanding.layoutManager = GridLayoutManager(this,2)

        //Creamos la coleccion de Item del POJO. La LISTA
        val itemsShop = (0..20).map {
            ItemLanding("Titulo $it", "Desc $it", 200.00 + it)
        }

        //Creamos el ADAPTADOR
        val adapter = AdapterLanding(itemsShop)
        recyclerViewLanding.adapter = adapter

    }
}
