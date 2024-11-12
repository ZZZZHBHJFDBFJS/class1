import kotlin.math.abs


class Point(val x: Double, val y: Double)


class Triangle(private val a: Point, private val b: Point, private val c: Point) {
    
    fun isPointInside(point: Point): Boolean {
       
        val areaABC = 0.5 * abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y))
        val areaPBC = 0.5 * abs(point.x * (b.y - c.y) + b.x * (c.y - point.y) + c.x * (point.y - b.y))
        val areaPCA = 0.5 * abs(point.x * (c.y - a.y) + c.x * (a.y - point.y) + a.x * (point.y - c.y))
        val areaPAB = 0.5 * abs(point.x * (a.y - b.y) + a.x * (b.y - point.y) + b.x * (point.y - a.y))
        return areaPBC + areaPCA + areaPAB == areaABC
    }
}
fun main() {

    println("Задача 1: Точка и треугольник")
    print("Введите координаты точки (x, y): ")
    val pointX = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val pointY = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val point = Point(pointX, pointY)

    print("Введите координаты вершины A треугольника (x, y): ")
    val aX = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val aY = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val a = Point(aX, aY)

    print("Введите координаты вершины B треугольника (x, y): ")
    val bX = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val bY = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val b = Point(bX, bY)

    print("Введите координаты вершины C треугольника (x, y): ")
    val cX = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val cY = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val c = Point(cX, cY)

    val triangle = Triangle(a, b, c)

    if (triangle.isPointInside(point)) {
        println("Точка находится внутри треугольника.")
    } else {
        println("Точка находится вне треугольника.")
    }
    println()}
