package s01_basics.b04_math

/*
LCM And GCD
https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
 */

fun lcmAndGcd(A: Long, B: Long): List<Long> {
    val gcd = findGcd(A, B)
    val lcm = (A * B) / gcd
    return listOf(lcm, gcd)
}

fun findGcd(a: Long, b: Long): Long {
    return if (b == 0L) a else findGcd(b, a % b)
}

fun main() {
    check(lcmAndGcd(5, 10) == listOf(10L, 5L))
}

/*
Java code:
    Long[] lcmAndGcd(Long A , Long B) {
        Long gcd = findGcd(A, B);
        Long lcm = (A * B) / gcd;

        Long[] ans = { lcm, gcd };
        return ans;
    }

    Long findGcd(Long a, Long b) {
        if(b == 0) return a;
        return findGcd(b, a % b);
    }
 */