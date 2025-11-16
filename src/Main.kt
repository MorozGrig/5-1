fun main() {
    println("Введите координаты вершин треугольника:")

    val p1 = Point(readCoordinate("X1: "), readCoordinate("Y1: "))
    val p2 = Point(readCoordinate("X2: "), readCoordinate("Y2: "))
    val p3 = Point(readCoordinate("X3: "), readCoordinate("Y3: "))

    val triangle = Triangle(p1, p2, p3)

    println("Введите координаты точки для проверки:")

    val point = Point(readCoordinate("X: "), readCoordinate("Y: "))

    if (triangle.isPoint(point)) {
        println("Точка внутри треугольника.")
    } else {
        println("Точка вне треугольника.")
    }
}

fun readCoordinate(prompt: String): Double {
    while (true) {
        print(prompt)
        val input = readLine()
        try {
            if (input != null) {
                return input.toDouble()
            } else {
                println("Пожалуйста, введите число.")
            }
        } catch (e: NumberFormatException) {
            println("Некорректный ввод. Попробуйте снова.")
        }
    }
}