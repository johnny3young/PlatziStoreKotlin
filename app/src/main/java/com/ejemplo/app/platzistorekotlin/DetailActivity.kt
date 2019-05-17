package com.ejemplo.app.platzistorekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Validamos que el item no sea nulo para recuperar la info
        intent?.let {
            val textFromMain = it.extras.getString("Text")
            txtDetails.text = textFromMain
        }

    }
}
