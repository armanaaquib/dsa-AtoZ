package s01_basics.b02_patterns

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
    val n = 5
    for (i in 1..n) {
        printPattern(i)
    }
    for (i in n - 1  downTo 1) {
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
