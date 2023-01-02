package s01_basics.b02_patterns

/* Pattern
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */

fun main() {
    val n = 5

    for (i in 1 ..n) {
        printRow(i, n)
    }

    for (i in n downTo 1) {
        printRow(i, n)
    }
}

private fun printRow(i: Int, n: Int) {
    for (j in i until n) {
        print(" ")
    }
    for (j in 1 until 2 * i) {
        print("*")
    }
    println()
}

/*
Java code: Problem: https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9
    void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        for (int i = n; i >= 1; i--) {
            printRow(i, n);
        }
    }

    private void printRow(int i, int n) {
        for (int j = i; j < n; j++) {
               System.out.print(" ");
        }

        for(int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
 */