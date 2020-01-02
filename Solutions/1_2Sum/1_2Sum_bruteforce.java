//2 Sum, Brute force, O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 2){
        	return null;
        }
        for (int i = 0; i < n; i++){
        	for (int j = i+1; j < n; j++){
        		if (nums[i] + nums[j] == target){
        			int[] res = new int[]{i, j};
                    return res;
        		}
        	}
        }
        return null;
    }
}