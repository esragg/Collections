package com.example.collections.arraylist

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val dersNotlariListesi = ArrayList<DersNotlar>()

    while (true) {

        print("Dersin adini giriniz: ")
        val ders = girdi.next()

        print("Dersin notunu giriniz: ")
        val not = girdi.nextInt()

        val yeniNot = DersNotlar(ders,not)
        dersNotlariListesi.add(yeniNot)

        println("Cikmak icin (1) - Devam etmek icin diger sayilar")
        val cikis = girdi.nextInt()

        if(cikis == 1) {

            println("*******************")

            var toplam = 0

            for (dn in dersNotlariListesi) {
                println("${dn.ders} : ${dn.not}")
                toplam += dn.not
            }
            val ortalama = toplam / dersNotlariListesi.size

            println("*******************")
            println("ORTALAMA: $ortalama")

            if(ortalama >= 50) {
                println("GECTINIZ")
            } else {
                println("KALDINIZ")
            }
            println("Cikis yapildi")
            break
        }
    }
}