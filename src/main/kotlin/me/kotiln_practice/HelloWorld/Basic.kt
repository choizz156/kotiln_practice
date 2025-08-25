package me.kotiln_practice.HelloWorld

fun main() {
    println("hello world")

    var a = 11
    var b = 1.4
    var w = "sdf"
    a += 2
    b -= 1
    w += "df"
    println(a)
    println(b)
    println(w)

    val f = 11
    // f = 12 오류
    val e = 1.45
    //e = 1.4

    val n: Int = 1
    val p:Double = 1.2
    val s:String = """
        sdf
        sdf
        sdf
    """
    print(s)
}