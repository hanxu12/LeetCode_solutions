//424. Longest Repeating Character Replacement, sliding window, O(n)
class Solution {
    public int characterReplacement(String s, int k) {
        //edge cases
        if (s == null || s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        //toCharArray with complexity O(n)
        char[] char_arr = s.toCharArray();
        int[] bank = new int[26];

        int i = 0;
        int max = 0;
        //sliding window
        for (int j = 0; j < char_arr.length; j++){
            bank[char_arr[j] - 'A']++;
            //O(k)
            while (!isValid(bank, k)) {
                bank[char_arr[i++] - 'A']--;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

//helper method to check if a substring is valid
    private boolean isValid(int[] subarray, int k){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 26; i++){
            sum += subarray[i];
            max = Math.max(subarray[i], max);
        }
        return (sum - max <= k);
    }
}