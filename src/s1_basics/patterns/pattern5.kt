package s1_basics.patterns

/* Pattern
*****
****
***
**
*
 */

fun main() {
    for (i in 0..4) {
        for (j in 1..5 - i) {
            print("*")
        }
        println()
    }
}