package s1_basics.patterns

/* Pattern
1
12
123
1234
12345
 */

fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}