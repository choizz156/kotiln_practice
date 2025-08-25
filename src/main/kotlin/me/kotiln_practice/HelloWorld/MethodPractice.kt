package me.kotiln_practice.HelloWorld


/*
*
* fun 함수이름(p1: 타입1, p2: 타입2, ...): 반환타입{
*
* return ...
* }
*
*
* */
fun multiplyByTwo(x: Int): Int {
    println("2곱함")
    return x*2
}

fun hello(): Unit{
    println("hello")
}

fun helloY(){
    println("helloY")
}

fun multiplyBy3(x: Int): Int = x * 3
fun multiplyBy4(x: Int) = x * 4

fun main() {
    val r = multiplyByTwo(3)
    println(r)
    hello()
    helloY()
    println(multiplyBy3(5))
    println(multiplyBy4(5))
}