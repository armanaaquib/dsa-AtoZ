package s01_basics.b05recursion

/*
Sum of first N Natural Numbers
https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
 */

fun sumOfFirstN(n: Int): Int {
    if(n == 1) return 1
    return n + sumOfFirstN(n - 1)
}

//fun sumOfFirstN(n: Int): Int {
//    return n * (n + 1) / 2
//}

fun main() {
    check(sumOfFirstN(5) == 15)
}