package s1_basics.patterns

/* Pattern
*****
*****
*****
*****
*****
Question Link: https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..n) {
            print("* ")
        }
        println()
    }
}

/*
Java code:
    void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 */
