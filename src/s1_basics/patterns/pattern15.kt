package s1_basics.patterns

/* Pattern
ABCDE
ABCD
ABC
AB
A
 */

fun main() {
    for(i in 5 downTo 1) {
        var c = 'A'
        for(j in 1..i) {
            print(c++)
        }
        println()
    }
}