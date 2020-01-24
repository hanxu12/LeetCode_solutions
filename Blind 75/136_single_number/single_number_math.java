//136. Single Number, Math method 
class Solution {
    public int singleNumber(int[] nums) {
    	int res = 0;
        Set<Integer> hset = new HashSet<Integer>();
        for (int i: nums){
        	hset.add(i);
        }
        for (int j: nums){
        	res -= j;
        }
        for (int k: hset){
        	res += 2*k;
        }
        return res;
    }
}