class Solution {
    public char findTheDifference(String s, String t) {
        int[] new_array = new int[26];
        for (int i = 0; i < s.length(); i++){
        	new_array[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++){
        	new_array[t.charAt(j) - 'a']--;
            if (new_array[t.charAt(j) - 'a'] == -1){
            	return (t.charAt(j));
            }
        }

        return '0';
    }
}