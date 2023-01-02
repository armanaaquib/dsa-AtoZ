package s01_basics.b04_math

/*
Palindrome Number
https://leetcode.com/problems/palindrome-number/
 */

fun isPalindrome(x: Int): Boolean {
    if(x < 0) return false

    val revX = reverseN(x)

    return x == revX
}

fun reverseN(x: Int): Int {
    var rev = 0
    var num = x

    while(num != 0) {
        val digit = num % 10
        rev = rev * 10 + digit
        num /= 10
    }

    return rev
}

fun main() {
    check(isPalindrome(121))
    check(!isPalindrome(-121))
}