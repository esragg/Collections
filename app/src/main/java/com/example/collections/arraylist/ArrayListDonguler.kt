package com.example.collections.arraylist

fun main() {

    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for(meyve in meyveler){
        println("Sonuc : $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()) {
        println("Sonuc  : $indeks : $meyve")
    }
}