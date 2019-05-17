package com.ejemplo.app.platzistorekotlin

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId
import android.widget.Toast

//Extension Function
fun Activity.toastShort(mensaje:String){
    Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show()
}

//Extension Function
fun Activity.toastLong(mensaje:String){
    Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
}

//
fun ViewGroup.inflate(layoutId:Int):View{
    return LayoutInflater.from(context).inflate(layoutId,this,false)
}