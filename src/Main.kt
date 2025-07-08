fun main() {
    readln()
    val x = readln()
    val y = readln().toInt()

    println(
        x.split(" ").count { it.toInt() == y }
    )
}