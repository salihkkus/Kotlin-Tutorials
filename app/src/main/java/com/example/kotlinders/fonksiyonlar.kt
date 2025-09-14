package com.example.kotlinders

var sayac = 0

fun main()
{
    ilkFonksiyon()
    ilkFonksiyon()
    cikarma(15,10)

    var ilksonuc = carpma(10,20)
    var ikincisonuc = cikarma(10,20)

    println(ilksonuc)
    println(ikincisonuc) // hata verir çünkü return kullanılmadı

}


fun ilkFonksiyon()
{
    sayac++
    println("sayac bu kadar calıstı : $sayac")
}


//girdi almak

fun cikarma(a: Int, b: Int)
{
    println("Cikarma isleminin sonucu : ${a-b}")
}


//cıktı vermek - return

fun carpma(a: Int, b: Int) : Int
{
    return a * b
}