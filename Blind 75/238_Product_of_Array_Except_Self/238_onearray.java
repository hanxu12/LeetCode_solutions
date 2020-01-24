//238. 1 array only
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res_array = new int[n];
    
        //compute from left to right
        int temp_product = 1;
        for (int i = 0; i < n; i++){
        	if (i == 0){
        		res_array[i] = 1;
        	} else{
        		temp_product = temp_product * nums[i-1];
        		res_array[i] = temp_product;
        	}
        }
        //from right to left
        temp_product = 1;
        for (int j = n-1; j > -1; j--){
        	if (j != n-1){
        		temp_product = temp_product * nums[j+1];
        		res_array[j] = temp_product*res_array[j];
        	}
        }

        return res_array;
    }
}