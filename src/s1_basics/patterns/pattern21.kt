package s1_basics.patterns

/* Pattern
****
*  *
*  *
*  *
****
 */

fun main() {
    for (i in 1..5) {
        for (j in 1..4) {
            if (i == 1 || i == 5 || j == 1 || j == 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

