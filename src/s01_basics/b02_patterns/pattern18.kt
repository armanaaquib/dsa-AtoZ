package s01_basics.b02_patterns

/* Pattern
E
D E
C D E
B C D E
A B C D E
 */

fun main() {
    val n = 5
    for(i in 0 until n) {
        var alphabet = 'E' - i
        for(j in 0..i) {
            print(alphabet++)
            print(" ")
        }
        println()
    }
}