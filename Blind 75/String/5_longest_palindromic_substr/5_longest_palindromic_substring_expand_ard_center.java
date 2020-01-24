//647. Palindromic Substrings, Expand around the center, O(n^2)
//easier to understand
//but not very efficient b/c produces substrings all the time
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        String res = s.substring(0, 1);

        for (int center = 0; center < 2*n-1; center++){
            int left = center/2;
            int right = left + center % 2;
            String temp_str = "";
            while (left>= 0 && right <= n-1 && s.charAt(left) == s.charAt(right)) {
                temp_str = s.substring(left, right+1);
                left -= 1;
                right += 1;
                
            }
            if (temp_str.length() > res.length()) {
                res = temp_str;
            }
        }
        return res;
    }
}


//more efficient but more obscure
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int max_right = 0, max_left = 0, max_len = 1;
        for (int center = 0; center < 2*n-1; center++){
            int left = center/2;
            int right = left + center % 2;
            int temp_left = left;
            int temp_right = left;
            while (left >= 0 && right <= n-1 && s.charAt(left) == s.charAt(right)) {
                temp_left = left;
                temp_right = right;
                left -= 1;
                right += 1;
                
            }
            if (temp_right - temp_left + 1 > max_len) {
                max_right = temp_right;
                max_left = temp_left;
                max_len = max_right - max_left + 1;
            }

        }
        return s.substring(max_left, max_right + 1);
    }
}