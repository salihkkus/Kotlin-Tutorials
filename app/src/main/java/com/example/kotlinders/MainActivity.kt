package com.example.kotlinders

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //lateinit
    lateinit var kerem : persona

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var kerem = persona(yas = 15, isim = "kerem", meslek = "öğrenci")

        var salih = persona(yas = 20, isim = "salih", meslek = "öğrenci")
        println(salih.yas)



        //nullability

        var benimInt : Int? = null

        //elvis operator - eğer soldaki değer null gelirse sağdaki değeri atar
        println(benimInt ?: 10)

        // yontemlerden biri bu şekilde kullanabiliriz
        benimInt?.let {
            println(it * 2)
        }

        //diger yontem
        if(benimInt != null)
        {
            println(benimInt * 2)
        }
    }

    fun testFonksiyonu()
    {

    }
}