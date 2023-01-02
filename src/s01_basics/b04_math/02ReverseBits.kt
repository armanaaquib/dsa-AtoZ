package s01_basics.b04_math

/*
Reverse Bits
https://leetcode.com/problems/reverse-bits/description/
https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
 */

fun reverseBits(n:Int):Int {
    var num = n
    var rev = 0

    for(i in 1..32) {
        rev = rev shl 1

        if(num and 1 == 1) rev++

        num = num shr 1
    }

    return rev
}


fun main() {
    check(1342177280 == reverseBits(10))
}