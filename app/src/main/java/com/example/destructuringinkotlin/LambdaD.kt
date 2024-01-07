package com.example.destructuringinkotlin

fun main(){
    val users = listOf("Alice" to 25, "Bob" to 30, "Charlie" to 28)

    users.forEach { (name, age) ->
        println("$name is $age years old")
    }

}