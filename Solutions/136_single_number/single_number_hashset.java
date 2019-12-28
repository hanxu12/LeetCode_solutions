//136. Single Number (HashSet)
class Solution {
    public int singleNumber(int[] nums) {
		Set<Integer> hset = new HashSet<Integer>();
		for (int i: nums){
			if (hset.contains(i)){
				hset.remove(i);
			} else{
				hset.add(i);
			}
		}
		return (int)(hset.toArray()[0]);      
    }
}