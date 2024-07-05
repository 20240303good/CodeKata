class Solution {
    fun solution(n: Int): Int {

        val quotient = n / 7

        val remainder = n % 7
        

        return if (remainder == 0) {
            quotient
        } else {
            quotient + 1
        }
    }
}
