package com.example.destructuringinkotlin

data class Point(val x: Int, val y: Int)

fun main(){

    val point = Point(10, 20)
    val (x, y) = point
    println("x-axis = $x")
    println("y-axis = $y")

    // unused declarations
    val (_,b) = point
    println("b-axis $b")
 }