package s1_basics.patterns

/* Pattern
A
AB
ABC
ABCD
ABCDE
 */

fun main() {
    for(i in 1..5) {
        var c = 'A'
        for(j in 1..i) {
            print(c++)
        }
        println()
    }
}