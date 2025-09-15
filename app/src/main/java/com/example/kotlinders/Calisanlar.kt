package com.example.kotlinders

class Calisanlar(val isim: String, maas: Int, var departman: String, var yas: Int) {

    private val _maas = maas

    fun maasGoster(): Int {
        return _maas
    }


    }
