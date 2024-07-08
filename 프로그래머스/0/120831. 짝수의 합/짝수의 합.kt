class Solution {
    fun solution(n: Int): Int {
        var num = IntArray(n){ it+1 }
        return num.filter{it%2==0}.sum()
    }
}