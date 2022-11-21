package s1_basics.patterns

/* Pattern
1
22
333
4444
55555
Problem: https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_4
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(i + " ");
            }
            System.out.println();
        }
    }
 */