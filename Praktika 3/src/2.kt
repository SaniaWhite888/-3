fun main() {
    println("Введите три числа:")
    val num1_1 = readLine()!!.toInt()
    val num2_2 = readLine()!!.toInt()
    val num3_3 = readLine()!!.toInt()
    if (num1_1 == num2_2 || num1_1 == num3_3 || num2_2 == num3_3) {
        println("Ошибка: среди чисел есть равные")
    } else {
        val average = (num1_1 + num2_2 + num3_3) / 3.0
        println("Среднее значение: $average")
    }
}