
class Solution {
	public int coinChange(int[] coins, int amount) {
		//create DP array
		int[] dp = new int[amount+1];
		//fill DP with a large value - amount + 1
		for (int i = 0; i < dp.length; i++){
			dp[i] = amount+1;
		}
		dp[0] = 0;
		//for each dp slot, it stores the min Coins needed to make the coin change
		for (int i = 1; i < dp.length; i++){
			for (int j = 0; j < coins.length; j++){
				if (coins[j] <= i){
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		if (dp[amount] > amount){
			return -1;
		} else{
			return dp[amount];
		}
	}
}
