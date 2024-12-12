import java.io.File
import kotlin.math.abs

val filepath = "./input.txt"
val lines=  File(filepath).readLines()

val rightAppearances = mutableMapOf<Int, Int>()
val leftArray = mutableListOf<Int>()

lines.forEach {
    val split = it.split("   ")

    leftArray.add(split[0].toInt())
    val right = split[1].toInt()


    if (rightAppearances.containsKey(right)) {
        rightAppearances[right] = rightAppearances[right]!! + 1
    } else {
        rightAppearances[right] = 1
    }   
}

var score = 0

leftArray.forEach {
    if (rightAppearances.containsKey(it)) {
        score += it * rightAppearances[it]!!
    }
}

println(score)

