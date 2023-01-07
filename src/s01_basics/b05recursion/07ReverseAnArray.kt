package s01_basics.b05recursion

fun reverseArray(array: MutableList<Int>, idx: Int = 0) {
    if(idx >= array.size / 2) return

    val temp = array[idx]
    array[idx] = array[array.lastIndex - idx]
    array[array.lastIndex - idx] = temp
}

fun main() {
    val array = mutableListOf(1, 2, 3, 4, 5)
    reverseArray(array)
    println(array)
}