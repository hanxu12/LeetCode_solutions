//121. Best Time to Buy and Sell Stock, Brute Force, O(n*n)
class Solution {
    public int maxProfit(int[] prices) {
    	int n = prices.length;
    	int maxProfit = 0;
    	if (n < 2){
    		return maxProfit;
    	}
        for (int i = 0; i < n; i++){
        	for (int j = 1; j < n; j++){
        		maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        	}
        }
        return maxProfit;
    }
}