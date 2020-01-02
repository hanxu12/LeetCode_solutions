//Math
class Solution {
    public int missingNumber(int[] nums) {
    	int n = nums.length;
    	int res = 0;
    	//Sum up the desired total : 1+2+3+...+n
    	for (int i = 0; i < n+1; i++){
    		res+= i;
    	}
    	//Delete each individual element from nums
    	for (int i = 0; i < n; i++){
    		res-= nums[i];
    	}
    	//return the remaining, which is the missing piece
    	return res;
    }
}