fun main(){
        println("Задача 12")
        println("Введите двузначное число:")
        val number12 = readLine()!!.toInt()

        val firstDigit12 = number12 / 10
        val secondDigit12 = number12 % 10

        if (firstDigit12 > secondDigit12) {
            println("Первая цифра больше второй")
        } else if (firstDigit12 < secondDigit12) {
            println("Вторая цифра больше первой")
        } else {
            println("Цифры одинаковы")
        }

    }