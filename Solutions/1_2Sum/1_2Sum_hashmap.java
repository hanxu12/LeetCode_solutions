//2 Sum, One pass Hashmap, O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 2){
            throw new IllegalArgumentException("No two sum solution");
        }
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (hmap.containsKey(target - nums[i])){
                return new int[]{hmap.get(target-nums[i]), i};
            } else{
                hmap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}