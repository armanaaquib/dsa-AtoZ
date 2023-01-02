package s01_basics.b02_patterns

/* Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

fun main() {
    val n = 5
    var num = 1
    for (i in 1..n) {
        for (j in 1..i) {
            print(num++)
            print(" ")
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 */