package s1_basics.patterns

/* Pattern
*********
 *******
  *****
   ***
    *
 */

fun main() {
    for (i in 5 downTo   0) {
        for (j in 1..5 - i) {
            print(" ")
        }
        for (j in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}