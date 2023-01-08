package s01_basics.b05_recursion

/*
Valid Palindrome
https://leetcode.com/problems/valid-palindrome/
 */

fun isPalindrome(s: String): Boolean {
    return checkPalindrome(s, 0, s.lastIndex)
}

fun checkPalindrome(s: String, start: Int, end: Int): Boolean {
    if(start >= end) {
        return true
    }

    if(!s[start].isLetterOrDigit()) {
        return checkPalindrome(s, start + 1, end)
    }

    if(!s[end].isLetterOrDigit()) {
        return checkPalindrome(s, start, end - 1)
    }

    return s[start].lowercaseChar() == s[end].lowercaseChar() && checkPalindrome(s, start + 1, end - 1)
}

fun main() {
    check(isPalindrome("A man, a plan, a canal: Panama"))
    check(!isPalindrome("race a car"))
}