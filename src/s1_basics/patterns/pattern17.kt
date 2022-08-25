package s1_basics.patterns

/* Pattern
A
ABA
ABCBA
ABCDCBA
 */

fun main() {
    for (i in 1..4) {
        for (j in 1..4 - i) {
            print(" ")
        }
        var c = 'A'
        for (j in 1..i) {
            print(c++)
        }
        c--
        for (j in 1 until i) {
            print(--c)
        }
        println()
    }
}