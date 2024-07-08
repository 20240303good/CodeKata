class Solution {
    fun solution(n: Int,array:IntArray): Int {
        var num = inrArrayOf(1..n)
        return num.filter(it%2==0).sum()
    }
}