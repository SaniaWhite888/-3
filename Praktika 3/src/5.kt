fun main() {
    println("Введите длины сторон треугольника:")
    val side1 = readLine()!!.toInt()
    val side2 = readLine()!!.toInt()
    val side3 = readLine()!!.toInt()
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        println("Треугольник может существовать")
    } else {
        println("Треугольник не может существовать")
    }
}