class Solution {
    fun solution(num: Int): String {
        var number = num%2
        
        if (number== 0) {
            return "Even"
        } else {
            return "Odd"
        }
        
    }
}