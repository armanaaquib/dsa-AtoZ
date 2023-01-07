package s01_basics.b05recursion

/*
Print N to 1 without loop
https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
 */

fun printNTo1(N: Int) {
    // code here
    if (N == 0) return
    print(N)
    print(" ")
    printNos(N - 1)
}

fun main() {
    printNTo1(5)
}

/*
Java code:
    void printNos(int N) {
        // code here
        if(N == 0)
            return;
        System.out.print(N);
        System.out.print(" ");
        printNos(N - 1);
    }
 */