package me.kotiln_practice.HelloWorld

fun main() {
    val answer = 42

    println("found $answer!")
    println("found $123!")

    ////

    val cond = true;
    println(
        "${if(cond) 'a' else 'b'}"
    )

    val x = 10
    println("$x + 4 = ${x + 4}")

    val s = "key"

    println(""" s = "$s" """)
    println(""" s = "${x + 3}" """)

}