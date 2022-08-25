package s1_basics.patterns

/* Pattern
A
BB
CCC
DDDD
EEEEE
 */

fun main() {
    var c = 'A'
    for(i in 1..5) {
        for(j in 1..i) {
            print(c)
        }
        c++
        println()
    }
}