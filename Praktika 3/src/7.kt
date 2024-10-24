fun main() {
    println("Введите два вещественных числа:")
    val num1_7 = readLine()!!.toDouble()
    val num2_7 = readLine()!!.toDouble()
    if (num1_7 > num2_7) {
        println("$num1_7 больше $num2_7")
    } else if (num1_7 < num2_7) {
        println("$num1_7 меньше $num2_7")
    } else {
        println("$num1_7 равно $num2_7")
    }
}