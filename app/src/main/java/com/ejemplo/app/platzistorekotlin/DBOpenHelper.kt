package com.ejemplo.app.platzistorekotlin

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

//Se necesita un CONTEXTO para iniciar las DB
class DBOpenHelper (ctx:Context):ManagedSQLiteOpenHelper(ctx,"PlatziStore", null,1){

    //Necesitamos crear una instanacia del HELPER
    companion object {
        private var instance: DBOpenHelper? = null

        //creamos una función que nos permita obtener la instancia
        fun getInstance(ctx: Context): DBOpenHelper? = if (instance == null){
            instance = DBOpenHelper(ctx)
            instance
        }else {
            instance
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //Definimos las comlumnas de mi table
        val id= "id" to INTEGER + PRIMARY_KEY
        val name = "name" to TEXT
        val desc = "desc" to TEXT
        val price = "price" to REAL

        db?.createTable("Productos", true, id, name, desc,price)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.dropTable("Productos", true)
    }

    //Tenemos que sobrescribir el GET
    val Context.database:DBOpenHelper?
    get() = getInstance(applicationContext)

}