fun main(){
    println("Введите два целых числа:")
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    if (m % n == 0) {
        println("Частное от деления: ${m / n}")
    } else {
        println("$m на $n нацело не делится")
    }
}