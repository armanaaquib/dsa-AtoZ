package s1_basics.patterns

/* Pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

fun main() {
    for (i in 1..5) {
        var n = i % 2
        for (j in 1..i) {
            print(n)
            print(" ")
            n = if (n == 0) 1 else 0
        }
        println()
    }
}