class Solution {
    fun solution(n: Int): IntArray {
      
        val answer = mutableListOf<Int>()
        for (i in 1..n) {
            if (i % 2 != 0) {
                answer.add(i)
            }
        }
    
        return answer.toIntArray()
    }
}
