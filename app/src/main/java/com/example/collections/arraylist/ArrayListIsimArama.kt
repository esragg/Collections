package com.example.collections.arraylist

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("zeynep")
    isimler.add("sedat")
    isimler.add("ercan")

    print("Aratmak icin isim giriniz: ")
    val isim = girdi.next()

    for(i in isimler){
        if(i == isim) {
            println("Isim mevcut")
            break
        }
    }
}