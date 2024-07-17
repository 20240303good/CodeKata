class Solution {
    fun solution(n: Long): Long {
        // n을 문자열로 변환한 후 각 자릿수를 리스트로 변환
        val digits = n.toString().toList()
        
        // 각 자릿수를 큰 순서대로 정렬한 후 문자열로 변환
        val sortedDigits = digits.sortedDescending().joinToString("")
        
        // 정렬된 문자열을 Long 타입의 정수로 변환하여 반환
        return sortedDigits.toLong()
    }
}
