fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val end = numbers.lastIndex
    numbers[0] = numbers[end].also { numbers[end] = numbers[0] }
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}