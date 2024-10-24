fun main() {
    println("Введите два числа (большее и меньшее):")
    val num1_4 = readLine()!!.toInt()
    val num2_4 = readLine()!!.toInt()
    if (num1_4 % num2_4 == 0) {
        println("$num1_4 кратно $num2_4")
    } else {
        val remainder = num1_4 % num2_4
        println("$num1_4 не кратно $num2_4. Остаток от деления: $remainder")
    }
}