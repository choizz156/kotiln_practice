package challenge1

fun main() {
    val f1 = -384.34f
    val f2 = (-23843).toFloat()

    val f3: Float? = -394f

    val sa = shortArrayOf(1,2,3,4)
    val sa2: Array<Short> = arrayOf(1,2,3,4)

    val intArray: Array<Int?> = Array(40){ i -> (i + 1) * 5}

    val ca = charArrayOf('a','b')

    val x :String? = null
    val a = x?.lowercase() ?: "non null"
    println(a)

    val r = a?.let{
        it.lowercase().replace("non", "yes")
    }
    println(r)

    val c: String? = null
    val result = c!!.uppercase()
}