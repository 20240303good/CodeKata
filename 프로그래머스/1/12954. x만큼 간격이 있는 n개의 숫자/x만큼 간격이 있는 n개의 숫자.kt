class Solution {
    fun solution(x: Int, n: Int): LongArray {
      
        val answer = LongArray(n)
      
        for (i in 0 until n) {
            answer[i] = x.toLong() * (i + 1)
        }
        
        return answer
    }
}
