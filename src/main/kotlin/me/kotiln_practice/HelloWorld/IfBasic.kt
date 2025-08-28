package me.kotiln_practice.HelloWorld


fun trueOrFalse(exp: Boolean): String =
    if (exp)
        "it's True"
    else
        "It's False"


fun oneOrTheOther(exp: Boolean): String {
    if (exp)
        return "True"

    return "false"
}


fun main() {
    val x: Boolean = 1 >= 1

    if (x) println("ok")


    val y = false
    if (!y) {
        println("!y is true")
    }

    val b = 1
    print(trueOrFalse(b < 3))

    println(oneOrTheOther(true))
}