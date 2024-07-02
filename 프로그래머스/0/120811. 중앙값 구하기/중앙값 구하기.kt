class Solution {
    fun solution(array: IntArray): Int {
        
        val sortedArray = array.sorted()
       
        val midIndex = sortedArray.size / 2
      
        return sortedArray[midIndex]
    }
}
