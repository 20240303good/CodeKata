class Solution {
    fun solution(n: Int): Int {
        var x = 2
        while (x <= n) {
            if (n % x == 1) {
                return x
            }
            x++
        }
        return -1 
    }
}
