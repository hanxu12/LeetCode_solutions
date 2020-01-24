//3. Longest Substring Without Repeating Characters, SLiding window, O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	Set<Character> hset = new HashSet<>();
    	int i = 0;
    	int j = 0;
    	int max = 0;
    	while (i < s.length() && j < s.length()) {
    		if (!hset.contains(s.charAt(j))){
    			hset.add(s.charAt(j));
    			j++;
    			max = Math.max(max, j - i);
    		} else{
    			hset.remove(s.charAt(i));
    			i++;
    		}
    	}
    	return max;
    }
}