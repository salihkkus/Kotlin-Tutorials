package com.example.kotlinders

fun main()
{
    println("merhaba dunya")
    println("ben salih")
    println("kotlin ogreniyorum")

    // yorum satırı

    println(3 * 4)
    println(30 / 3)

    //veri tipleri ve değişkenler

    var x = 10
    println(x)
    println(x * 10)
    //var değişken tanımlarken kullanılır

    // Implicit (Kapalı) Tanımlama
    val  y = 5
    //y = 10 hata verir çünkü val sabittir
    println(y)
    println(x + y)
    // val const gibi değişmez bir değeri tanımlarken kullanılır

    //Explicit (Açık) Tanımlama
    var ornekLong : Long = 100
    var ornekByte : Byte = 127
    var onrekShort : Short = 32767
    var ornekInt : Int = 21474

    println(ornekInt * onrekShort)


    val pi = 3.14
    val ornekDouble : Double = 2.5
    println(pi * ornekDouble)

    val ornekFloat : Float = 1.232432f
    println(ornekFloat * ornekDouble)


    val benimString = "benim yeni metnim"
    println(benimString)

    val isim = "salih"
    println(isim.uppercase())

    val soyisim = "karakus"
    println(isim + soyisim)

    println("77" + "15")
}