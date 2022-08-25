package s1_basics.patterns

/* Pattern
12345
1234
123
12
1
 */

fun main() {
    for (i in 0..4) {
        for (j in 1..5 - i) {
            print(j)
        }
        println()
    }
}