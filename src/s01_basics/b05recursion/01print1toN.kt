package s01_basics.b05recursion

/*
Print 1 To N Without Loop
https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
 */

fun printNos(N: Int) {
    if (N == 0) return
    printNos(N - 1)
    print(N)
    print(" ")
}

fun main() {
    printNos(5)
}

/*
Java code:
    void printNos(int N)
    {
        if(N == 0)
            return;

        printNos(N - 1);
        System.out.print(N);
        System.out.print(" ");
    }
 */