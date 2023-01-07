package s01_basics.b05recursion

/*
Print GFG n times
https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1
 */

fun printGfg(N: Int) {
    if (N == 0) return
    print("GFG ")
    printGfg(N - 1)
}

fun main() {
    printGfg(5)
}

/*
Java code:
    void printGfg(int N) {
        if(N == 0)
            return;
        System.out.print("GFG ");
        printGfg(N - 1);
    }
 */