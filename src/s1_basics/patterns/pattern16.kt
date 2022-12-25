package s1_basics.patterns

/* Pattern
A
BB
CCC
DDDD
EEEEE
 */

fun main() {
    val n = 5
    var c = 'A'
    for(i in 1..n) {
        for(j in 1..i) {
            print(c)
        }
        c++
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        var c = 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
 */