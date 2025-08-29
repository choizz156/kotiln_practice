package challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("is same? : ${hello1 === hello2}")

    val text: Any = "the Any Type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println(text.uppercase())
    }

    val text2 = """
    |    1
    |   11
    |  111
    | 1111
    """.trimMargin("1")
    println(text2)
}