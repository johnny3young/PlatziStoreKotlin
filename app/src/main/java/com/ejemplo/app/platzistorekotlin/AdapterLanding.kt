package com.ejemplo.app.platzistorekotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

//Se realiza el BINDING de los datos que vamos a recibir
class AdapterLanding (val data: List<ItemLanding>):RecyclerView.Adapter<AdapterLanding.Holder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder =
        Holder(parent)

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding: ItemLanding) {

        }
    }
}