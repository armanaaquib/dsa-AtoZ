package s1_basics.patterns

/* Pattern
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

fun main() {
    for (i in 1..5) {
        printPattern(i)
    }
    for (i in 4 downTo 1) {
        printPattern(i)
    }
}

private fun printPattern(i: Int) {
    for (j in 1..i) {
        print("*")
    }
    for (j in 1..(10 - 2 * i)) {
        print(" ")
    }
    for (j in 1..i) {
        print("*")
    }
    println()
}
