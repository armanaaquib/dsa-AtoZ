package s01_basics.b04_math

/*
Armstrong Numbers
https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
 */

import kotlin.math.pow


fun armstrongNumber(n: Int): String {
    val digits = parseDigits(n)
    val p = digits.size.toDouble()
    val sum = digits.fold(0) { sum, digit -> sum + digit.toDouble().pow(p).toInt() }
    return if (n == sum) "Yes" else "No"
}

fun parseDigits(n: Int): ArrayList<Int> {
    var num = n
    val digits = ArrayList<Int>()
    while (num > 0) {
        val digit = num % 10
        digits.add(digit)
        num /= 10
    }
    return digits
}

fun main() {
    check(armstrongNumber(153) == "Yes")
    check(armstrongNumber(123) == "No")
}

/*
Java code:
    String armstrongNumber(int n){
        // code here
        ArrayList<Integer> digits = parseDigits(n);
        int p = digits.size();

        int sum = 0;
        for(int i = 0; i < digits.size(); i++) {
            sum += Math.pow(digits.get(i), p);
        }

        if(n == sum)
            return "Yes";
        else
            return "No";
    }

    ArrayList<Integer> parseDigits(int num) {
        ArrayList<Integer> digits = new ArrayList<Integer>();

        while(num > 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }

        return digits;
    }
 */