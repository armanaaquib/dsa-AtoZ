package s1_basics.patterns

/* Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

fun main() {
    var n = 1
    for (i in 1..5) {
        for (j in 1..i) {
            print(n++)
            print(" ")
        }
        println()
    }
}