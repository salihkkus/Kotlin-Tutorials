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

        // OOP

        var esma = Sanatci(isim = "esma", yas = 7, enstruman = "gitar")
        println(esma.isim)
        esma.isim = "esmabetul"
        println(esma.isim)

        esma.sarkiSoyle()


        //Encapsulation - kapsülleme

      //  esma.cinsiyet = "erkek"  hata verir çünkü private tanımladık
        esma.cinsiyetYazdir()

        // esma.gozRengi = "siyah" hata verir çünkü set private tanımladık
        println(esma.gozRengi)



        // Inheritance - Kalıtım Miras
        var hero = Kahraman("superman","ucmak")
        println(hero.isim)
        println(hero.yetenek)

        val muhtesemHero = SuperKahraman("batman", "zengin olmak")
        muhtesemHero.kos()


        // Polymorphism - çok biçimlilik

        //statik polymorphism
        var islem = Islemler()
        println(islem.cikarma(2,3,4,5))
        println(islem.cikarma(2,3))
        println(islem.cikarma(2,3,4))

        //dinamik polymorphism
        var kedi = hayvan()
        var kopek = kopek()

        val ornekDizi = arrayOf(kedi,kopek)
        ornekDizi.forEach { it.sesCikar() }


        //Abstraction - Soyutlama

        //var insan = Insan()  abstract sınıftan nesne uretemeyiz




    }
}