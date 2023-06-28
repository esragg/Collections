package com.example.collections.arraylist

fun main() {

    val meyveler = setOf<String>("Cilek","Muz","Elma","Kivi")
    val iller = mutableSetOf<String>("Bursa","Istanbul","Ankara","Izmir")
    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(20) // eklemedi cunku var
    println(sayilar.toString())

    sayilar.add(21)
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(25))

    for (s in sayilar) {
        println(s)
    }


    for((i,s) in sayilar.withIndex()) {
        println("${i+1}. sayi: $s")
    }


    sayilar.remove(10)
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString())
}