package s01_basics.b02_patterns

/* Pattern
12345
1234
123
12
1
Problem: https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6
 */

fun main() {
    val n = 5
    for (i in 0 until n) {
        for (j in 1..n - i) {
            print(j)
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
               System.out.print(j + " ");
            }
            System.out.println();
        }
    }
 */