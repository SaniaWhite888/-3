fun main() {
    println("Введите три числа:")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val max = if (num1 > num2) {
        if (num1 > num3) num1 else num3
    } else {
        if (num2 > num3) num2 else num3
    }
    println("Максимальное число: $max")
}