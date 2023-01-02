package s01_basics.b02_patterns

/* Pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
Problem: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11
 */

fun main() {
    val n = 5
    for (i in 1..n) {
        var num = i % 2
        for (j in 1..i) {
            print(num)
            print(" ")
            num = if (num == 0) 1 else 0
        }
        println()
    }
}

/*
Java code:
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i % 2;
            for (int j = 1; j <= i; j++)  {
                System.out.print(num);
                System.out.print(" ");
                if (num == 0) num = 1;
                else num = 0;
            }
            System.out.println();
        }
    }
 */