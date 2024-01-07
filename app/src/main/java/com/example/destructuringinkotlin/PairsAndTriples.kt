package com.example.destructuringinkotlin

fun main(){
    //Pairs
    val coordinates = Pair(37.7749, -122.4194)
    val (latitude, longitude) = coordinates

    println("Latitude: $latitude, Longitude: $longitude")


    //Triples
    // Creating a Triple
    val xyz: Triple<Int, Int, Int> = Triple(1, 2, 3)

// Accessing individual elements using destructuring
    val (x, y, z) = xyz

    println("x-axis: $x, y-axis: $y, z-axis: $z")


}
