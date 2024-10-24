fun main() {
    println("Введите расстояние в километрах:")
    val distanceKm = readLine()!!.toDouble()
    println("Введите расстояние в футах:")
    val distanceFeet = readLine()!!.toDouble()
    val distanceMeter = 0.305
    if (1000 < distanceMeter) {
        println("Расстояние в километрах меньше")
    }else{
        println("Расстояние в футах меньше")
    }
}