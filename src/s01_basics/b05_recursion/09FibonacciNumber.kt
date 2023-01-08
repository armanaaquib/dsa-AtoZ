package s01_basics.b05_recursion

/*
Fibonacci Number
https://leetcode.com/problems/fibonacci-number/
 */

fun fib(n: Int): Int {
    if(n <= 1) return n

    return fib(n - 1) + fib(n - 2)
}

fun main() {
    check(fib(4) == 3)
}