fun main(){
    println("Введите два числа:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}