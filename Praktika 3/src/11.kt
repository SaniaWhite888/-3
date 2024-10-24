fun main(){
    println("Введите натуральное число:")
    val num = readLine()!!.toInt()
    println("Число $num ${if (num % 2 == 0) "четное" else "нечетное"}")
    println("Число $num ${if (num % 10 == 7) "оканчивается цифрой 7" else "не оканчивается цифрой 7"}")
}