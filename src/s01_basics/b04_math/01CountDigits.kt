package s01_basics.b04_math

/*
Count Digits:
https://practice.geeksforgeeks.org/problems/count-digits5716/1
 */

fun evenlyDivides(N: Int): Int {
    var num = N
    var count = 0
    while (num > 0) {
        val digit = num % 10
        if (digit != 0 && N % digit == 0) {
            count++
        }
        num /= 10
    }

    return count
}

fun main() {
    check(2 == evenlyDivides(12))
}

/*
Java code:
    int evenlyDivides(int N){
        int num = N;
        int count = 0;

        while(num > 0) {
            int digit = num % 10;

            if(digit != 0 && N % digit == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }
 */
