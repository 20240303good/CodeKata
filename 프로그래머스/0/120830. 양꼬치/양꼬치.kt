class Solution {
    fun solution(n: Int, k: Int): Int {
        val lambSkewerPrice = 12000 
        val drinkPrice = 2000
        
        val totalLambSkewerPrice = n * lambSkewerPrice 
        val freeDrinks = n / 10 
        val totalDrinkPrice = (k - freeDrinks) * drinkPrice 
        
        return totalLambSkewerPrice + totalDrinkPrice 
    }
}