class Triangle(private val p1: Point,private val p2: Point,private val p3: Point) {
    fun isPoint(point: Point): Boolean{
        val demo = ((p2.y - p3.y)*(p1.x-p3.x)+(p3.x-p2.x)*(p1.y-p3.y))
        if (demo == 0.0) {
            return false
        }
        val a = ((point.x-p3.x)*(p2.y-p3.y)+(p3.x-p2.x)*(point.y-p3.y))/demo
        val b = ((p3.y-p1.y)*(point.x-p3.x)+(p1.x-p3.x)*(point.y-p3.y))/demo
        val c = 1-a-b
        return a >= 0 && b >= 0 && c >= 0
    }
}