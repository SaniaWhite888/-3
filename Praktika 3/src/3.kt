fun main() {
    println("Введите два числа:")
    val num1_3 = readLine()!!.toInt()
    val num2_3 = readLine()!!.toInt()
    if (num1_3 % 2 == 0 && num2_3 % 2 != 0) {
        println("Нечетное число: $num2_3")
    } else if (num1_3 % 2 != 0 && num2_3 % 2 == 0) {
        println("Нечетное число: $num1_3")
    } else {
        println("Ошибка: числа должны иметь разную четность")
    }
}