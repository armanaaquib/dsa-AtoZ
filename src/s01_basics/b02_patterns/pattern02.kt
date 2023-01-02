package s01_basics.b02_patterns

/* Pattern
*
**
***
****
*****
Question Link: https://practice.geeksforgeeks.org/problems/right-triangle/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_2
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 */