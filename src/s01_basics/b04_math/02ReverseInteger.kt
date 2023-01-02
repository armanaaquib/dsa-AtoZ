package s01_basics.b04_math

/*
Reverse Integer
https://leetcode.com/problems/reverse-integer/
 */

fun reverse(x: Int): Int {
    var reversedNumber = 0
    var num = x

    while (num != 0) {
        val digit = num % 10

        if (reversedNumber > Int.MAX_VALUE / 10 || reversedNumber == Int.MAX_VALUE && digit > 7) {
            return 0
        }
        if (reversedNumber < Int.MIN_VALUE / 10 || reversedNumber == Int.MIN_VALUE && digit > -8) {
            return 0
        }

        reversedNumber = reversedNumber * 10 + digit
        num /= 10
    }

    return reversedNumber
}

fun main() {
    check(-121 == reverse(-121))
}