package s1_basics.patterns

/* Pattern
A
ABA
ABCBA
ABCDCBA
 */

fun main() {
    val n = 4
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        var c = 'A'
        for (j in 1..i) {
            print(c++)
        }
        c--
        for (j in 1 until i) {
            print(--c)
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            c--;
            for (int j = 1; j < i; j++) {
                System.out.print(--c);
            }
            System.out.println();
        }
    }
 */