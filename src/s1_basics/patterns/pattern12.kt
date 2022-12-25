package s1_basics.patterns

/* Pattern
1      1
12    21
123  321
12344321
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..i) {
            print(j)
        }
        for (j in 1..n * 2 - i * 2) {
            print(" ")
        }
        for (j in i downTo 1) {
            print(j)
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i) * 4; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 */