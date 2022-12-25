package s1_basics.patterns

/* Pattern
****
*  *
*  *
*  *
****
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1 until n) {
            if (i == 1 || i == n || j == 1 || j == n - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

