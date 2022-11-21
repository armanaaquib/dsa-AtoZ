package s1_basics.patterns

/* Pattern
*
**
***
****
*****
****
***
**
*
Problem: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_10
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        printRow(i)
    }

    for (i in n - 1 downTo 1) {
        printRow(i)
    }
}

private fun printRow(i: Int) {
    for (j in 1..i) {
        print("*")
    }
    println()
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printRow(i);
        }
    }

    private void printRow(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 */