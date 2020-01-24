//136. Single Number, HashMap solution
class Solution {
    public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i: nums){
			//if found the element inside, remove it
			if (hmap.containsKey(i)){
				hmap.replace(i, 2);
			} //otherwise add the element 
			else{
				hmap.put(i, 1);
			}
		}
		//return the only val left
		for (int j: nums){
			if (hmap.get(j) == 1){
				return j;
			}
		}
		return 0;
    }
}