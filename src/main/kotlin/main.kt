import java.util.*

fun main() {

    /// К заданию 1

    println(isAnagram("Вabbchjfg", "Вbbacgfjh"))

    /// К Заданию 2

    val points = arrayOf(point(2, 3), point(2, 2), point(1, 1), point(2, 1), point(1, 1))
    val k = 3

    val res = kPointAboutZero(points, k)
    for (i in 0..res.lastIndex) {
        println(res[i].toArray().contentToString())
    }
}

fun isAnagram(string1: String, string2: String): Boolean {
    var result = false
    var stringHit = 0

    if (string1.length == string2.length) {
        for (i in 0..(string1.length - 1)) {
            if (string2.contains(string1[i], ignoreCase = false)) {
                stringHit++
            }
        }
        if (stringHit == string1.length) {
            result = true
        }
    }
    return result
}

fun kPointAboutZero(points: Array<point>, k: Int): Array<point> {

    val resultArrayPoint = Array(k) { points[1] }
    var resultArray = IntArray(k)
    var resultArraySorted = IntArray(k)
    val nums: PriorityQueue<Int> = PriorityQueue<Int>()

    for (i in 0..points.lastIndex) {
        nums.add(points[i].pointsD())
    }
    for (i in 0..k - 1) {
        resultArray[i] = nums.remove()
    }

    for (n in 0..k - 1) {
        for (h in 0..points.lastIndex) {
            if (resultArray[n] == points[h].pointsD()) {
                resultArrayPoint[n] = points[h]
            }
        }
    }
    return resultArrayPoint
}
