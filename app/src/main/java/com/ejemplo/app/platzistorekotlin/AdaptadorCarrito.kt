package com.ejemplo.app.platzistorekotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

class AdaptadorCarrito(val data:List<ItemListPOJO>) : RecyclerView.Adapter<AdaptadorCarrito.Holder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder =
        Holder(AnkoItemCart().createView(AnkoContext.Companion.create(p0!!.context, this, false)))

        //Creamos el item de la lista
        //Holder(AnkoItemCart().createView(AnkoContext.Companion.create(p0.context,this,false)))

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        //Bindear toda la lista PERO primero en la clase HOLDER (está abajo) se crean los VIEW que vamos a estar utilizando
        p0.bindView(data[p1])
    }

    override fun getItemCount(): Int = data.size

    class Holder(itemView:View):RecyclerView.ViewHolder (itemView) {
        val txtViewTitle by lazy {
            itemView.find<TextView>(R.id.txtTitle)
        }
        val txtViewDesc by lazy {
            itemView.find<TextView>(R.id.txtDesc)
        }
        val txtViewPrice by lazy {
            itemView.find<TextView>(R.id.txtPrice)
        }
        fun bindView (item: ItemListPOJO){
            with(item){
                txtViewTitle.text = titulo
                txtViewDesc.text = desc
                txtViewPrice.text = price
            }
        }
    }

}
