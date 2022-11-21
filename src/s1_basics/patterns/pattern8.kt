package s1_basics.patterns

/* Pattern
*********
 *******
  *****
   ***
    *
Problem: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8
 */

fun main() {
    val n = 5
    for (i in n downTo 1) {
        for (j in i until n) {
            print(" ")
        }
        for (j in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
               System.out.print(" ");
            }

            for(int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
 */