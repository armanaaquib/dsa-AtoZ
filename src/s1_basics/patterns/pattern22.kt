package s1_basics.patterns

/* Pattern
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */

fun main() {
    val n = 4
    for (i in 1..n) {
        var num = n
        for (j in 1..i) {
            print(num--)
            print(" ")
        }
        num++
        for (j in 1..(n * 2 - 1 - 2 * i)) {
            print(num)
            print(" ")
        }
        for (j in 1..i) {
            if(num == 1) {
                num = 2
                continue
            }
            print(num++)
            print(" ")
        }
        println()
    }
    for (i in n - 1 downTo 1) {
        var num = n
        for (j in 1..i) {
            print(num--)
            print(" ")
        }
        num++
        for (j in 1..(n * 2 - 1 - 2 * i)) {
            print(num)
            print(" ")
        }
        for (j in 1..i) {
            print(num++)
            print(" ")
        }
        println()
    }
}