//268. Missing Number, HashSet, O(n)
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hset = new HashSet<>();
        //Use max will slow down, just use length is better
        //int max = 0;
        for (int individual : nums){
        	hset.add(individual);
        	//max = Math.max(individual, max);
        }

        for (int i = 0; i < n + 1; i++){
        	if (!hset.contains(i)){
        		return i;
        	}
        }
    	return -1;
    }
}