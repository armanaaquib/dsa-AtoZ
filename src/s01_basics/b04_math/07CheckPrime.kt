package s01_basics.b04_math

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if(num < 2)
        return false

    for (n in 2..sqrt(num.toDouble()).toInt()) {
        if(num % n == 0)
            return false
    }

    return true
}

fun main() {
    check(isPrime(2))
    check(isPrime(7))
    check(!isPrime(4))
    check(!isPrime(6))
}