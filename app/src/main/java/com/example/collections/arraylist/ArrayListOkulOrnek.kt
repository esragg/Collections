package com.example.collections.arraylist

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci>()
    while (true) {

        print("Ogrenci adi giriniz: ")
        val ad = girdi.next()

        print("Ogrenci sinifi giriniz: ")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad, sinif)
        sayac++

        ogrenciler.add(yeniOgrenci)

        println("Cikmak icin (1) - Devam etmek icin diger sayilar")
        val cikis = girdi.nextInt()

        if(cikis == 1) {

            for (ogrenci in ogrenciler) {
                println("******************")
                println("Ogrenci no : ${ogrenci.no}")
                println("Ogrenci ad : ${ogrenci.ad}")
                println("Ogrenci sinif : ${ogrenci.sinif}")
            }

            println("Cikis yapildi")
            break
        }
    }
}