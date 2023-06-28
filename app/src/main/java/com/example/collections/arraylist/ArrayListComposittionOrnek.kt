package com.example.collections.arraylist

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()

    for (i in 1..5) { //1,2,3,4,5

        print("$i. Personel Ad : ")
        val isim = girdi.next()

        print("$i. Personel adres il : ")
        val il = girdi.next()

        print("$i. Personel adres ilce : ")
        val ilce = girdi.next()


        val adres = Adres(il, ilce)

        val personel = Personel(i, isim, adres)

        personeller.add(personel)
    }

    for (p in personeller) {
        println("************************")
        println("Personel no : ${p.no}")
        println("Personel ad  : ${p.isim}")
        println("Personel adres il : ${p.adres.il}")
        println("Personel adres ilce : ${p.adres.ilce}")
    }
}