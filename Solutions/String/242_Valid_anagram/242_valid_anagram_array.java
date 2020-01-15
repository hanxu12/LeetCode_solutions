//242. Valid Anagram, Array Table, O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] checkArr = new int[26];
        for (int i = 0; i < s.length(); i++){
        	Character temp_ch = s.charAt(i);
        	checkArr[temp_ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
        	Character temp_ch = t.charAt(i);
        	checkArr[temp_ch - 'a']--;
        }

        for (int i: checkArr){
        	if (i != 0){
        		return false;
        	}
        }
        return true;
    }
}