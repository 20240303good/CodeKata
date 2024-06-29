class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val strN = n.toString()
        
        for (char in strN) {
            answer += char.toString().toInt()
        }

        return answer
    }
}