import java.lang.reflect.Array
import java.util.*

public class point(val x: Int, val y: Int) {

    fun pointsD(): Int {
        val res = x * x + y * y
        return res
    }

    fun toArray(): IntArray {
        return intArrayOf(x, y)
    }

}