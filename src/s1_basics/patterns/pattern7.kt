package s1_basics.patterns

/* Pattern
    *
   ***
  *****
 *******
*********
 */

fun main() {
    for (i in 1 .. 5) {
        for (j in 4 downTo  i) {
            print(" ")
        }
        for (j in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}