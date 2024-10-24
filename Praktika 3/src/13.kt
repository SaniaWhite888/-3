fun main(){
    println("Введите четырехзначное число:")
    val number13 = readLine()!!.toInt()

    val firstDigit13 = number13 / 1000
    val secondDigit13 = (number13 % 1000) / 100
    val thirdDigit13 = (number13 % 100) / 10
    val fourthDigit13 = number13 % 10

    // а)
    val sumFirstTwo = firstDigit13 + secondDigit13
    val sumLastTwo = thirdDigit13 + fourthDigit13
    if (sumFirstTwo == sumLastTwo) {
        println("Сумма двух первых цифр равна сумме двух последних")
    } else {
        println("Сумма двух первых цифр не равна сумме двух последних")
    }

    // б)
    val sumDigits13 = firstDigit13 + secondDigit13 + thirdDigit13 + fourthDigit13
    if (sumDigits13 % 3 == 0) {
        println("Сумма цифр кратна трем")
    } else {
        println("Сумма цифр не кратна трем")
    }
}
