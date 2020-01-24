//121. Best Time to Buy and Sell Stock, Onepass, own ver
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int curr_price: prices){
            if (curr_price - minPrice > maxProfit){
                maxProfit = curr_price - minPrice;
            }
            minPrice = Math.min(minPrice, curr_price);
        }
        return maxProfit;
    }
}

/*
*LC original answer
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
*/