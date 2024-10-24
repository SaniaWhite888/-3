fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()
    val isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
    val days = if (isLeap) 366 else 365
    println("Год $year ${if (isLeap) "високосный" else "не високосный"}. Количество дней: $days")
}
