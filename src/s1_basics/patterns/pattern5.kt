package s1_basics.patterns

/* Pattern
*****
****
***
**
*
Problem: https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5
 */

fun main() {
    val n = 5
    for (i in 0 until n) {
        for (j in 1..n - i) {
            print("*")
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
               System.out.print("* ");
            }
            System.out.println();
        }
    }
 */