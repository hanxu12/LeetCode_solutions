//3. Longest Substring Without Repeating Characters, BruteForce, O(n^2)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++){
        	for (int j = i+1; j <= n ; j++){
        		if (checkUnique(s, i, j)) {
        			ans = Math.max(ans, j-i);
        		}
        	}
        }
        return ans;
    }
//helper method to check if substring is unique
    private boolean checkUnique(String s){
    	Set<Character> hset = new HashSet<>();
    	for (int i = 0; i < s.length(); i++){
    		Character temp_char = s.charAt(i);
    		if (hset.contains(temp_char)){
    			return false;
    		}
    		hset.add(temp_char);
    	}
    	return true;
    }
}