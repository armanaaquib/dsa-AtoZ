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
    for (i in 1..4) {
        var n = 4
        for (j in 1..i) {
            print(n--)
            print(" ")
        }
        n++
        for (j in 1..(7 - 2 * i)) {
            print(n)
            print(" ")
        }
        for (j in 1..i) {
            if(n == 1) {
                n = 2
                continue
            }
            print(n++)
            print(" ")
        }
        println()
    }
    for (i in 3 downTo 1) {
        var n = 4
        for (j in 1..i) {
            print(n--)
            print(" ")
        }
        n++
        for (j in 1..(7 - 2 * i)) {
            print(n)
            print(" ")
        }
        for (j in 1..i) {
            print(n++)
            print(" ")
        }
        println()
    }
}