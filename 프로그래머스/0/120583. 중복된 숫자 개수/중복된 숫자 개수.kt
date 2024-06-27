class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var count: Int = 0 

       
        for (element in array) {
            if (element == n) {
                count++ 
            }
        }

        return count 
    }
}
