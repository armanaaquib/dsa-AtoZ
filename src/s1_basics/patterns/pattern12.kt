package s1_basics.patterns

/* Pattern
1      1
12    21
123  321
12344321
 */

fun main() {
    for (i in 1..4) {
        for (j in 1..i) {
            print(j)
        }
        for (j in 1..8 - i * 2) {
            print(" ")
        }
        for (j in i downTo 1) {
            print(j)
        }
        println()
    }
}