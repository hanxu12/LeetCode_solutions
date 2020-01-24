//136. Single Number, HashMap2 solution
class Solution {
    public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i: nums){
			//if found the element inside, remove it
			if (hmap.containsKey(i)){
				hmap.remove(i);
			} //otherwise add the element 
			else{
				hmap.put(i, 1);
			}
		}
		//return the only key left (get keyset, convert to array, get array's 1st element)
		return (int)(hmap.keySet().toArray()[0]);
		//return the only val, do not use
		//return (int)(hmap.values().toArray()[0]);
    }
}