import java.io.File
import kotlin.math.abs

val filepath = "../input.txt"
val lines=  File(filepath).readLines()

val leftList = mutableListOf<Int>()
val rightList = mutableListOf<Int>()

lines.forEach {
    val split = it.split("   ")
    val left = split[0]
    val right = split[1]

    leftList.add(left.toInt())
    rightList.add(right.toInt())
}

leftList.sort()
rightList.sort()

var diff = 0;

leftList.forEachIndexed { index, left ->
    val right = rightList[index]
    
    diff += abs(right - left)
}

println(diff)

