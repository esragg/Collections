package com.example.collections.arraylist

fun main() {

    val sayilar = mapOf<Int,String>(1 to "Bir", 2 to "Iki")
    val oranlar =  mutableMapOf<Double,String>(1.5 to "Oran1", 3.4 to "Oran2")
    val iller = HashMap<Int,String>()


    iller.put(16,"BURSA")
    iller.put(34,"ISTANBUL")

    println(iller.toString())
    iller.put(16,"YENI BURSA")
    println(iller.toString())

    println(iller.get(34))
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())
    println(iller.containsKey(16))
    println(iller.containsValue("ISTANBUL"))

    for ((anahtar,deger) in iller) {
        println("$anahtar : $deger")
    }

    iller.remove(16)
    println(iller.toString())

    iller.clear()
    println(iller.toString())
}