//238. Product of Array Except Self, Brute force
//time limit exceeded
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //edge case, actually no need to deal with it
        if (n == 0){
        	return null;
        }
        int temp_product = 1;
        for (int i = 0; i < n; i++){
        	for (int j = 0; j < n; j++){
        		if (j != i){
        			temp_product = temp_product * nums[j];
        		}
        	}
        	res[i] = temp_product;
        	temp_product = 1;
        }
        return res;
    }
}