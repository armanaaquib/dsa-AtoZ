package s1_basics.patterns

/* Pattern
ABCDE
ABCD
ABC
AB
A
 */

fun main() {
    for(i in 5 downTo 1) {
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
        for(int i = n; i >= 1; i--) {
            char c = 'A';
            for(int j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
 */