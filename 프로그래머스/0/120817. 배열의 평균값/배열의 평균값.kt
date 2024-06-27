class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = numbers.sum()
        var average = sum.toDouble()/numbers.size
        return average
    }
}