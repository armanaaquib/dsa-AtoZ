package s01_basics.b06_hashing

/*
Count frequency of each element in the array
https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
 */

fun frequencyCount(array: List<Int>): Map<Int, Int> {
    return array.groupingBy { it }.eachCount()
}

fun main() {
    println(frequencyCount(listOf(1, 1, 2, 1, 3, 2)))
}