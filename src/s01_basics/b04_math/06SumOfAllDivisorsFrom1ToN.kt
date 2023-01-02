package s01_basics.b04_math

/*
Sum of all divisors from 1 to n
https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
 */

fun sumOfDivisors(N: Int): Long {
    var sum: Long = 0
    for (i in 1..N) {
        sum += (N / i * i).toLong()
    }
    return sum
}

//fun sumOfDivisors(N: Int): Long {
//    var sum = 0
//    for (i in 1..N) {
//        sum += findSumOfDivisors(i)
//    }
//    return sum.toLong()
//}
//
//fun findSumOfDivisors(num: Int): Int {
//    var sum = 0
//    var i = 1
//    while (i <= Math.sqrt(num.toDouble())) {
//        if (num % i == 0) {
//            sum += i
//            val q = num / i
//            if (i != q) sum += q
//        }
//        i++
//    }
//    return sum
//}

fun main() {
    check(sumOfDivisors(4) == 15L)
}

/*
Java code:
    long sumOfDivisors(int N){
        long sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += (N / i) * i;
        }
        return sum;
    }
 */