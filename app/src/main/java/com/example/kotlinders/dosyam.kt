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


    val benimStr : String
    benimStr = "benim yeni bir string" // initialze , init
    println(benimStr)

    //conversion

    var Stringim : String = "40"
    var Intim : Int = Stringim.toInt()
    println(Intim * 5)


    var benimBoolean = true
    println(benimBoolean)


    println(3 > 5)
    println(2 == 2)
    println(4 != 5)

    println("salih" == "salih")
    println(3>5 && 4>3)
    println(3>5 || 4>3)


    //Diziler - Array

    val diziElemanı = "ilk"
    val benimDizim = arrayOf(diziElemanı,"salih","karakus","ahmet")


    println(benimDizim[0])
    println(benimDizim.size)

    benimDizim[1] = "ahmet"
    println(benimDizim[1])

    //benimDizim[5] = "mehmet"   bu bir hata oluşturur çünkü dizinin boyutunu aştık başta belirlenenin üstüne çıkamayız

    val karısıkDizi = arrayOf("ali",24,true,3.14)
    println(karısıkDizi[2])


    // Arraylist

    val diziListem = arrayListOf("ali","veli","ahmet")
    println(diziListem.get(2))
    diziListem.add("kerem")
    println(diziListem[3])

    diziListem.removeAt(3)

    val listem1 = ArrayList<String>()
    val listem2 = arrayListOf<String>()  // ikiside aynı şey

    val karisikBosListe = ArrayList<Any>()
    karisikBosListe.add("ali")
    karisikBosListe.add(12)
    karisikBosListe.add(true)



    // Set - HashSet

    val ornekSet = setOf(10, 10, 10, 20, 20, 30, 30, 40)
    println(ornekSet.size)

    ornekSet.forEach { println(it) }


    val bosSet = HashSet<String>()
    bosSet.add("salih")
    bosSet.add("salih")
    bosSet.add("salih")
    bosSet.add("karakus")
    bosSet.forEach { println(it) }

    val ornekTekilSet = benimDizim.toHashSet()
    ornekTekilSet.forEach { println(it) }



    // Map  -  HashMap

    val yemek = arrayListOf("elma","et","tavuk")
    val kalori = arrayListOf(100,300,200)

    println("${yemek.get(0)}'nın kalorisi : ${kalori.get(0)}")

    val yemekKaloriMap = hashMapOf<String,Int>()
    yemekKaloriMap.put("elma",100)
    yemekKaloriMap.put("et",300)
    println(yemekKaloriMap["elma"])


    yemekKaloriMap.put("elma",200)
    println(yemekKaloriMap.get("elma"))


    // if else

    var sayi = 0
    sayi++
    sayi--

    //kalan bulma
    println(10 % 3)

    val skor = 15

    if(skor < 10)
    {
        println("kaybettiniz")
    }
    else if(skor >= 10 && skor < 20)
    {
        println("güzel bir skor aldın")
    }
    else if(skor >= 20 && skor < 30)
    {
        println("puanlı bir skor aldın")
    }
    else
    {
        println("maalesef kaybettiniz")
    }



    // When

    var notRakam = 0
    var notString = ""

    when(notRakam)
    {
        0 -> notString = "FF"
        1 -> notString = "F"
        2 -> notString = "E"
        3 -> notString = "D"
        4 -> notString = "C"
    }

    println(notString)

    //While Dongusu

    var i = 0

    while(i < 10)
        {
        println(i)
        i++
    }

    //for dongusu

    val baskaDizi = arrayListOf(5,10,15,20,25)
    for(numara in baskaDizi)
    {
        println(numara)
    }

    //range
    for(num in 1..9)
    {
        println(num * 8)

    }

}