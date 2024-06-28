class Solution {
    fun solution(arr: IntArray): Double {
       val sum = arr.sum()
        return sum.toDouble() / arr.size
    }
}