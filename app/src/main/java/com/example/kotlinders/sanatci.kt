package com.example.kotlinders

class Sanatci(var isim : String, var yas : Int, var enstruman : String) : Insan() , Sarki
{

    override fun deneme() {

    }
    private var cinsiyet = "kadın"

    var gozRengi = ""
        private set
        public get

    fun cinsiyetYazdir()
    {
        println(cinsiyet)
    }
    fun sarkiSoyle()
    {
        println("${isim} bize sarkı söyle")
    }
}