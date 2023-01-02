package s01_basics.b02_patterns

/* Pattern
A
AB
ABC
ABCD
ABCDE
 */

fun main() {
    val n = 5
    for(i in 1..n) {
        var c = 'A'
        for(j in 1..i) {
            print(c++)
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            char c = 'A';
            for(int j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
 */