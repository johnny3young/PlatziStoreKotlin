package com.ejemplo.app.platzistorekotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_landing.view.*

//Se realiza el BINDING de los datos que vamos a recibir
class AdapterLanding (val data: List<ItemLanding>):RecyclerView.Adapter<AdapterLanding.Holder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder =
        Holder(p0.inflate(R.layout.item_landing))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0.bindView(data[p1])
    }

    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding: ItemLanding) {
            //Permite acceder a las objetos del layout SIN USAR "findViewById"
            with(itemLanding){
                itemView.txtTitleItem.text = title
                itemView.txtDescItem.text = desc
                itemView.txtPriceItem.text = "${String.format("%.2f",price)}"
            }
        }
    }
}