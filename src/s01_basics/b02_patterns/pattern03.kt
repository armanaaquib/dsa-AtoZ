package s01_basics.b02_patterns

/* Pattern
1
12
123
1234
12345
Question Link: https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
 */
