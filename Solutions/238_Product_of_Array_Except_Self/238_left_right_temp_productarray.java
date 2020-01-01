//238. left+right temp product array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_product = new int[n];
        int[] right_product = new int[n];
        //compute left product array;
        int temp_product = 1;
        for (int i = 0; i < n; i++){
        	if (i == 0){
        		left_product[i] = 1;
        	} else{
        		temp_product = temp_product * nums[i-1];
        		left_product[i] = temp_product;
        	}
        }

        temp_product = 1;
        for (int j = n-1; j > -1; j--){
        	if (j == n-1){
        		right_product[j] = 1;
        	} else{
        		temp_product = temp_product * nums[j+1];
        		right_product[j] = temp_product;
        	}
        }

        for (int k = 0; k < n; k++){
        	left_product[k] = left_product[k] * right_product[k];
        }
        return left_product;
    }
}