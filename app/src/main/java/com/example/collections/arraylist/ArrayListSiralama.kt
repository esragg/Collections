package com.example.collections.arraylist

fun main() {
    val k1 = Kisiler(1, "Ahmet")
    val k2 = Kisiler(2,"Zeynep")
    val k3 = Kisiler(3,"Berna")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Once")

    for (k in kisilerArrayList) {
        println("${k.kisiNo} - ${k.kisiAdi}")
    }

    println("Sayisal Kucukten Buyuge")

    val siralamaArrayList1  = kisilerArrayList.sortedWith(compareBy({it.kisiNo}))

    for (k in siralamaArrayList1) {
        println("${k.kisiNo} - ${k.kisiAdi}")
    }

    println("Sayisal Buyukten Kucuge")

    val siralamaArrayList2  = kisilerArrayList.sortedWith(compareByDescending({it.kisiNo}))

    for (k in siralamaArrayList2) {
        println("${k.kisiNo} - ${k.kisiAdi}")
    }

    println("Harfsel Buyukten Kucuge")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAdi })

    for(k in siralamaArrayList3){
        println("${k.kisiNo} - ${k.kisiAdi}")
    }
}