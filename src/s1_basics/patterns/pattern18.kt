package s1_basics.patterns

/* Pattern
E
D E
C D E
B C D E
A B C D E
 */

fun main() {
    for(i in 0..4) {
        var alphabet = 'E' - i
        for(j in 0..i) {
            print(alphabet++)
            print(" ")
        }
        println()
    }
}